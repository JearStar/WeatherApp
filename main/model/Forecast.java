package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class Forecast {
    private Location location;
    private Weather current;
    private List<Weather> byHour;

    //astro
    private String sunrise;
    private String sunset;
    private String moonPhase;

    public Forecast(JSONObject jsonObject) {
        JSONObject fcObject = (JSONObject) jsonObject.get("forecast");
        this.location = new Location(jsonObject);
        this.current = new Weather(jsonObject);

        this.byHour = (JSONArray) jsonObject.get("forecast");
        this.country = (String) locObject.get("country");
        this.lat = (double) locObject.get("lat");
        this.lon = (double) locObject.get("lon");
        this.tzId = (String) locObject.get("tz_id");
        this.localTime = (String) locObject.get("localtime");
}
