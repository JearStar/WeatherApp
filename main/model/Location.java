package model;

import org.json.JSONObject;

public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tzId;
    private String localTime;

    public Location(JSONObject jsonObject) {
        JSONObject locObject = (JSONObject) jsonObject.get("location");
        this.name = (String) locObject.get("name");
        this.region = (String) locObject.get("region");
        this.country = (String) locObject.get("country");
        this.lat = (double) locObject.get("lat");
        this.lon = (double) locObject.get("lon");
        this.tzId = (String) locObject.get("tz_id");
        this.localTime = (String) locObject.get("localtime");
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

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTzId() {
        return tzId;
    }

    public String getLocalTime() {
        return localTime;
    }
}
