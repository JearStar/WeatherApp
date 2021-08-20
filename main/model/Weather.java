package model;

import org.json.JSONObject;

import java.net.URL;

public class Weather {
    String lastUpdated;
    float tempC;
    float tempF;
    int isDay;
    String condition;
    URL icon;
    float windMph;
    float windKph;
    int windDegree;
    String windDir;

    public Weather(JSONObject object) {

    }
}
