package weather_project.controller;

import weather_project.model.*;

public class WeatherController implements IWeatherController {

    private IWeatherRepository weatherRepository = new WeatherRepository();

    @Override
    public void onUserInput(int command) {

        switch (command) {
            case 1:
                getCurrentWeather();
                break;
            case 2:
                System.out.println("Не реализовано");
                System.exit(1);
            case 3:
                gettAllFromDb();
            default:
                System.out.println("НЕТ ТАКОЙ КОМАНДЫ!");
                System.exit(1);
        }
    }

    private void getCurrentWeather() {
        weatherRepository.fetchWeatherFromApi(Period.NOW);
    }

    private void gettAllFromDb() {
        weatherRepository.readWeatherFromDb();
    }
//    private void getCurrentWeatherFiveDay() {
//        weatherProvider.getWeather(Period.FIVE_DAYS);
//    }


}
