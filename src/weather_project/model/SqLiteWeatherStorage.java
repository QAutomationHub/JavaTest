package weather_project.model;
import weather_project.GlobalState;
import weather_project.entity.WeatherObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqLiteWeatherStorage implements ILocalStorageProvider {

    static {
            try {
                GlobalState.getInstance()
                        .getConnection()
                        .createStatement()
                        .executeUpdate("CREATE TABLE IF NOT EXISTS weather (id INTEGER PRIMARY KEY AUTOINCREMENT, city TEXT, date TEXT, weather TEXT)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void saveWeather(WeatherObject weatherObject) {
        List<WeatherObject> saveWeather = new ArrayList<>();
        try {
            ResultSet resultSet = GlobalState.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM " + GlobalState.getInstance().DB_NAME);
            while (resultSet.next()) {
                String city = resultSet.getString(2);
                String date  = resultSet.getString(3);
                String weather = resultSet.getString(4);
                WeatherObject weatherObject1 = new WeatherObject(city, date, weather);
                saveWeather.add(weatherObject);
                saveWeather.forEach(System.out::println);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<WeatherObject> getAllWeather() {
        return null;
    }
}
