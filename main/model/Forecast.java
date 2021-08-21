package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

public class Forecast {
    private Location location;
    private Weather current;
    private List<ForecastHour> currentForecast;
    private HashMap<String, ForecastDay> extendedForecast; //includes current day

    public Forecast(JSONObject jsonObject) {
        JSONObject fcObject = jsonObject.getJSONObject("forecast");
        JSONArray fcdArray = fcObject.getJSONArray("forecastday");
        this.location = new Location(jsonObject); //location
        this.current = new Weather(jsonObject);   //current weather

        for (Object o : fcdArray) {
            String date = ((JSONObject) o).getString("date");
            ForecastDay fcd = new ForecastDay((JSONObject) o);
            this.extendedForecast.put(date, fcd);
        }
    }

    //getters
    public Location getLocation() {
        return location;
    }
    public Weather getCurrent() {
        return current;
    }
    public List<ForecastHour> getCurrentForecast() {
        return currentForecast;
    }
    public HashMap<String, ForecastDay> getExtendedForecast() {
        return extendedForecast;
    }
}
