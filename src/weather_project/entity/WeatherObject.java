package weather_project.entity;

public class WeatherObject {

    private String city;
    private String date;
    private String weather;

    public WeatherObject(String city, String date, String weather) {
        this.city = city;
        this.date = date;
        this.weather = weather;
    }

    public WeatherObject() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
