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

        JSONArray jsonArray = (JSONArray) jsonObject.get("forecast");
        for (Object o : jsonArray) {
            Weather weather = new Weather((JSONObject) o);
            byHour.add(weather);
        }

        JSONObject astroObject = (JSONObject) jsonObject.get("astro");
        this.sunrise = (String) astroObject.get("sunrise");
        this.sunset = (String) astroObject.get("sunset");
        this.moonPhase = (String) astroObject.get("moonPhase");
    }

    public Location getLocation() {
        return location;
    }

    public Weather getCurrent() {
        return current;
    }

    public List<Weather> getByHour() {
        return byHour;
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
