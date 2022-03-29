package weather_project.model;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import weather_project.GlobalState;

import java.io.IOException;

public class AccuWeatherProvider implements IWeatherProvider{

    private final String BASE_HOST = "dataservice.accuweather.com";

    private final OkHttpClient okHttpClient = new OkHttpClient();


    @Override
    public void getWeather(Period period) {
        try {
            detectedCityKeyByName();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String detectedCityKeyByName() throws IOException {
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

        Response locationResponse =
                okHttpClient.newCall(request).execute();

        if(!locationResponse.isSuccessful()) {
            throw  new IOException("Сервер ответил " + locationResponse.code());
        }

        String jsonResponse = locationResponse.body().string();
        System.out.println(jsonResponse);
        return jsonResponse;
    }

}
