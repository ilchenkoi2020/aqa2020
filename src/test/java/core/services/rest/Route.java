package core.services.rest;

public class Route {

    public static String getCurrentWeatherUrl(String access_key, String query) {
        return String.format("/current?access_key=%s&query=%s", access_key, query);
    }
}
