package model;

import org.json.JSONObject;

public class Location {
    private String name;
    private String region;
    private String country;
    private float lat;
    private float lon;
    private String tzId;
    private String localTime;

    public Location(JSONObject jsonObject) {
        JSONObject locObject =  jsonObject.getJSONObject("location");
        this.name = locObject.getString("name");
        this.region = locObject.getString("region");
        this.country = locObject.getString("country");
        this.lat = locObject.getFloat("lat");
        this.lon = locObject.getFloat("lon");
        this.tzId = locObject.getString("tz_id");
        this.localTime = locObject.getString("localtime");
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getTzId() {
        return tzId;
    }

    public String getLocalTime() {
        return localTime;
    }
}
