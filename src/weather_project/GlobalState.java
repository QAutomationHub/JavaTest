package weather_project;

import java.sql.Connection;

public final class GlobalState {



    private static GlobalState INSTANCE;
    private String selectedCity = null;
    public final String API_KEY = System.getenv("ACCUWEATHER_API_KEY");
    public final String DB_NAME = "application.db";

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private Connection connection;
    private GlobalState() {}

    public static GlobalState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GlobalState();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
}
