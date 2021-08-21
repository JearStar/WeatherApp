package model;

import org.json.JSONObject;

public class ForecastHour {
    private float windMph;
    private float windKph;
    private String windDir;
    private float pressureMb;
    private float pressureIn;
    private float precipMm;
    private float precipIn;
    private int humidity; //percentage
    private int cloud; //percentage of cloud coverage?? not sure what this one actually means
    private float feelsLikeC;
    private float feelsLikeF;
    private float windchillC;
    private float windchillF;
    private float heatIndexC;
    private float heatIndexF;
    private float dewpointC;
    private float dewpointF;
    private boolean willItRain;
    private int chanceOfRain; //percentage
    private boolean willItSnow;
    private int chanceOfSnow; //percentage
    private float visKm;
    private float visMiles;
    private float gustMph;
    private float gustKph;
    private float uv;

    public ForecastHour(JSONObject jsonObject) {
        windMph = jsonObject.getFloat("wind_mph");
        windKph = jsonObject.getFloat("wind_kph");
        windDir = jsonObject.getString("wind_dir");
        pressureMb = jsonObject.getFloat("pressure_mb");
        pressureIn = jsonObject.getFloat("pressure_in");
        precipMm = jsonObject.getFloat("precip_mm");
        precipIn = jsonObject.getFloat("precip_in");
        humidity = jsonObject.getInt("humidity");
        cloud = jsonObject.getInt("cloud");
        feelsLikeC = jsonObject.getFloat("feelslike_c");
        feelsLikeF = jsonObject.getFloat("feelslike_f");
        windchillC = jsonObject.getFloat("windchill_c");
        windchillF = jsonObject.getFloat("windchill_f");
        heatIndexC = jsonObject.getFloat("heatindex_c");
        heatIndexF = jsonObject.getFloat("heatindex_f");
        dewpointC = jsonObject.getFloat("dewpoint_c");
        dewpointF = jsonObject.getFloat("dewpoint_f");
        willItRain =  jsonObject.getInt("will_it_rain")==1;
        chanceOfRain = jsonObject.getInt("chance_of_rain");
        willItSnow =  jsonObject.getInt("will_it_snow")==1;
        chanceOfSnow = jsonObject.getInt("chance_of_snow");
        visKm = jsonObject.getFloat("vis_km");
        visMiles = jsonObject.getFloat("vis_miles");
        gustKph = jsonObject.getFloat("gust_kph");
        gustMph = jsonObject.getFloat("gust_mph");
        uv = jsonObject.getFloat("uv");
    }

    //getters
    public float getWindMph() {
        return windMph;
    }

    public float getWindKph() {
        return windKph;
    }

    public String getWindDir() {
        return windDir;
    }

    public float getPressureMb() {
        return pressureMb;
    }

    public float getPressureIn() {
        return pressureIn;
    }

    public float getPrecipMm() {
        return precipMm;
    }

    public float getPrecipIn() {
        return precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public float getFeelsLikeC() {
        return feelsLikeC;
    }

    public float getFeelsLikeF() {
        return feelsLikeF;
    }

    public float getWindchillC() {
        return windchillC;
    }

    public float getWindchillF() {
        return windchillF;
    }

    public float getHeatIndexC() {
        return heatIndexC;
    }

    public float getHeatIndexF() {
        return heatIndexF;
    }

    public float getDewpointC() {
        return dewpointC;
    }

    public float getDewpointF() {
        return dewpointF;
    }

    public boolean isWillItRain() {
        return willItRain;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }

    public boolean isWillItSnow() {
        return willItSnow;
    }

    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    public float getVisKm() {
        return visKm;
    }

    public float getVisMiles() {
        return visMiles;
    }

    public float getGustMph() {
        return gustMph;
    }

    public float getGustKph() {
        return gustKph;
    }

    public float getUv() {
        return uv;
    }
}
