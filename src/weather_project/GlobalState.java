package weather_project;

public final class GlobalState {

    private static GlobalState INSTANCE;
    private String selectedCity = null;
    public final String API_KEY = System.getenv("ACCUWEATHER_API_KEY");

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
