package weather_project.model;

import weather_project.entity.WeatherObject;

import java.util.List;

public interface ILocalStorageProvider {

    void saveWeather (WeatherObject weatherObject);

    List<WeatherObject> getAllWeather();

}
