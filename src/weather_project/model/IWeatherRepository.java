package weather_project.model;

import weather_project.entity.WeatherObject;

import java.util.List;

public interface IWeatherRepository {

    List<WeatherObject> fetchWeatherFromApi (Period period);

    List<WeatherObject> readWeatherFromDb();

    void saveWeatherInfoInDb(List<WeatherObject> weatherObjects);
}
