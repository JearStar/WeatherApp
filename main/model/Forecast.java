package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Forecast {
    private Location location;
    private Weather current;
    private List<Weather> currentForecast;
    private HashMap<String, List<Weather>> extendedForecast;

    //astro
    private String sunrise;
    private String sunset;
    private String moonPhase;

    public Forecast(JSONObject jsonObject) {
        JSONObject fcObject = jsonObject.getJSONObject("forecast");
        JSONArray fcdArray = fcObject.getJSONArray("forecastday");
        this.location = new Location(jsonObject); //location
        this.current = new Weather(jsonObject);   //current weather

        for (Object o : fcdArray) {
            List<Weather> hourlyWeather = new LinkedList<>();
            JSONObject dateObject = (JSONObject) o;

            String date = dateObject.getString("date");

            JSONArray hourObject = dateObject.getJSONArray("hour");
            for (Object ob : hourObject) {
                hourlyWeather.add((Weather) ob);
            }

            this.extendedForecast.put(date, hourlyWeather);     //keys: dates, values: a list of the hourly forecast on
                                                                // that day. Includes the current day
        }

        JSONObject astroObject = jsonObject.getJSONObject("astro");
        this.sunrise = astroObject.getString("sunrise");
        this.sunset = astroObject.getString("sunset");           //astro information only for current day
        this.moonPhase = astroObject.getString("moonPhase");
    }

    //getters
    public Location getLocation() {
        return location;
    }
    public Weather getCurrent() {
        return current;
    }
    public List<Weather> getCurrentForecast() {
        return currentForecast;
    }
    public HashMap<String, List<Weather>> getExtendedForecast() {
        return extendedForecast;
    }
    public String getSunrise() {
        return sunrise;
    }
    public String getSunset() {
        return sunset;
    }
    public String getMoonPhase() {
        return moonPhase;
    }
}
