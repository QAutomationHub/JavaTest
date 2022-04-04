package weather_project.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import weather_project.GlobalState;
import weather_project.entity.WeatherObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccuWeatherProvider implements IWeatherProvider{

    private final String BASE_HOST = "dataservice.accuweather.com";

    private final OkHttpClient okHttpClient = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<WeatherObject> getWeather(Period period) {
            String key = detectedCityKeyByName();
            if (period.equals(Period.NOW)) {
                HttpUrl url = new HttpUrl.Builder()
                        .scheme("http")
                        .host(BASE_HOST)
                        .addPathSegment("forecasts")
                        .addPathSegment("v1")
                        .addPathSegment("daily")
                        .addPathSegment("1day")
                        .addPathSegment(key)
                        .addQueryParameter("apikey", GlobalState.getInstance().API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .addHeader("accept", "application/json")
                        .url(url)
                        .build();

                try {
                    Response response = okHttpClient.newCall(request).execute();
                    System.out.println(response.body().string());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            /*
            1. Обработать ответ сервера
            2. На базе ответа создать экземпляр WeatherObject
            3. Положить все в ArrayList
            4. Вернуть ArrayList;
            */
            return new ArrayList<>();
    }

    private String detectedCityKeyByName() throws RuntimeException {
        String selectedCity = GlobalState.getInstance().getSelectedCity();
        HttpUrl detectLocationURL = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", GlobalState.getInstance().API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(detectLocationURL)
                .build();

        Response locationResponse = null;
        try {
            locationResponse = okHttpClient.newCall(request).execute();

            if(!locationResponse.isSuccessful()) {
                throw new RuntimeException("Сервер ответил " + locationResponse.code());
            }

            String jsonResponse = locationResponse.body().string();
            if (objectMapper.readTree(jsonResponse).size() > 0) {
                String code = objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
                String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
                String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
                System.out.printf("Найден город %s в стране %s, код - %s\n", cityName, countryName, code);
                return code;
            } else {
                throw new RuntimeException( selectedCity + " такой город не найден");
            }
        } catch (IOException e) {
        e.printStackTrace();
        throw  new RuntimeException(e);}
    }
    }

