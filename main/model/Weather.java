package model;

import org.json.JSONObject;

public class Weather {
    String lastUpdated;
    float tempC;
    float tempF;
    int isDay;
    String condition;
    String iconURL;
    float windMph;
    float windKph;
    int windDegree;
    String windDir;
    float pressureMb;
    float pressureIn;
    float precipMm;
    float precipIn;
    int humidity;
    int cloud;
    float feelslikeC;
    float feelslikeF;
    float visKm;
    float visMiles;
    float uv;
    float gustMph;
    float gustKph;
    float co;
    float no2;
    float o3;
    float so2;
    float pm25;
    float pm10;



    public Weather(JSONObject object) {
        lastUpdated = object.getString("last_updated");
        tempC = object.getFloat("temp_c");
        tempF = object.getFloat("temp_F");
        isDay = object.getInt("is_day");
        condition = object.getJSONObject("condition").getString("text");
        iconURL = object.getJSONObject("condition").getString("icon");
        windMph = object.getFloat("wind_mph");
        windKph = object.getFloat("wind_kph");
        windDegree = object.getInt("wind_degree");
        windDir = object.getString("wind_dir");
        pressureMb = object.getFloat("pressure_mb");
        pressureIn = object.getFloat("pressure_in");
        precipMm = object.getFloat("precip_mm");
        precipIn = object.getFloat("precip_in");
        humidity = object.getInt("humidity");
        cloud = object.getInt("cloud");
        feelslikeC = object.getFloat("feelslike_c");
        feelslikeF = object.getFloat("feelslike_f");
        visKm = object.getFloat("vis_km");
        visMiles = object.getFloat("vis_miles");
        uv = object.getFloat("uv");
        gustMph = object.getFloat("gust_mph");
        gustKph = object.getFloat("gust_kph");
        co = object.getJSONObject("air_quality").getFloat("co");
        no2 = object.getJSONObject("air_quality").getFloat("no2");
        o3 = object.getJSONObject("air_quality").getFloat("o3");
        so2 = object.getJSONObject("air_quality").getFloat("so2");
        pm25 = object.getJSONObject("air_quality").getFloat("pm2_5");
        pm10 = object.getJSONObject("air_quality").getFloat("pm10");
    }


    public String getLastUpdated() {
        return lastUpdated;
    }

    public float getTempC() {
        return tempC;
    }

    public float getTempF() {
        return tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public String getCondition() {
        return condition;
    }

    public String getIconURL() {
        return iconURL;
    }

    public float getWindMph() {
        return windMph;
    }

    public float getWindKph() {
        return windKph;
    }

    public int getWindDegree() {
        return windDegree;
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

    public float getFeelslikeC() {
        return feelslikeC;
    }

    public float getFeelslikeF() {
        return feelslikeF;
    }

    public float getVisKm() {
        return visKm;
    }

    public float getVisMiles() {
        return visMiles;
    }

    public float getUv() {
        return uv;
    }

    public float getGustMph() {
        return gustMph;
    }

    public float getGustKph() {
        return gustKph;
    }

    public float getCo() {
        return co;
    }

    public float getNo2() {
        return no2;
    }

    public float getO3() {
        return o3;
    }

    public float getSo2() {
        return so2;
    }

    public float getPm25() {
        return pm25;
    }

    public float getPm10() {
        return pm10;
    }

}
