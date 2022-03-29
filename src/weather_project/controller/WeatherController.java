package weather_project.controller;

import weather_project.model.AccuWeatherProvider;
import weather_project.model.IWeatherProvider;
import weather_project.model.Period;

public class WeatherController implements IWeatherController {

    private IWeatherProvider weatherProvider = new AccuWeatherProvider();

    @Override
    public void onUserInput(int command) {

        switch (command) {
            case 1:
                getCurrentWeather();
                break;
            case 2:
                System.out.println("Не реализовано");
                System.exit(1);
            default:
                System.out.println("НЕТ ТАКОЙ КОМАНДЫ!");
                System.exit(1);
        }
    }

    private void getCurrentWeather() {
        weatherProvider.getWeather(Period.NOW);
    }

}
