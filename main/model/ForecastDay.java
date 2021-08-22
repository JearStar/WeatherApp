package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ForecastDay {

    //date is the key in Forecast
    private float maxTempC;
    private float maxTempF;
    private float minTempC;
    private float minTempF;
    private float avgTempC;
    private float avgTempF;
    private float maxWindMph;
    private float maxWindKph;
    private float totalPrecipMm;
    private float totalPrecipIn;
    private float avgVisKm;
    private float avgVisMiles;
    private float avgHumidity;
    private boolean dailyWillItRain;
    private int dailyChanceOfRain; //percentage
    private boolean dailyWillItSnow;
    private int dailyChanceOfSnow; //percentage
    private String condition;
    private String iconUrl;
    private float uv;

    private Map<String, ForecastHour> hourlyWeather = new HashMap<>();

    //astro
    private String sunrise;
    private String sunset;
    private String moonPhase;

    public ForecastDay(JSONObject obj) {
        JSONObject jsonObject = obj.getJSONObject("day");
        maxTempC = jsonObject.getFloat("maxtemp_c");
        maxTempF = jsonObject.getFloat("maxtemp_f");
        minTempC = jsonObject.getFloat("mintemp_c");
        minTempF = jsonObject.getFloat("mintemp_f");
        avgTempC = jsonObject.getFloat("avgtemp_c");
        avgTempF = jsonObject.getFloat("avgtemp_f");
        maxWindKph = jsonObject.getFloat("maxwind_kph");
        maxWindMph = jsonObject.getFloat("maxwind_mph");
        totalPrecipMm = jsonObject.getFloat("totalprecip_mm");
        totalPrecipIn = jsonObject.getFloat("totalprecip_in");
        avgVisKm = jsonObject.getFloat("avgvis_km");
        avgVisMiles = jsonObject.getFloat("avgvis_miles");
        avgHumidity = jsonObject.getFloat("avghumidity");
        dailyWillItRain =  jsonObject.getInt("daily_will_it_rain")==1;
        dailyChanceOfRain = jsonObject.getInt("daily_chance_of_rain");
        dailyWillItSnow =  jsonObject.getInt("daily_will_it_snow")==1;
        dailyChanceOfSnow = jsonObject.getInt("daily_chance_of_snow");
        condition = jsonObject.getJSONObject("condition").getString("text");
        iconUrl = jsonObject.getJSONObject("condition").getString("icon");
        uv = jsonObject.getFloat("uv");


        JSONArray jsonArray = obj.getJSONArray("hour");

        for (Object o : jsonArray) {
            ForecastHour fch = new ForecastHour((JSONObject) o);
            this.hourlyWeather.put(((JSONObject) o).getString("time"), fch);
        }

        JSONObject astroObject = obj.getJSONObject("astro");
        this.sunrise = astroObject.getString("sunrise");
        this.sunset = astroObject.getString("sunset");
        this.moonPhase = astroObject.getString("moon_phase");
    }
}
