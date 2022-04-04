package weather_project.model;

import weather_project.entity.WeatherObject;

import java.util.List;

public interface IWeatherProvider {

    List<WeatherObject> getWeather(Period period);
}
