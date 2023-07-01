package com.example.MapApi;

public class Location {
    private double lat;
    private double lng;
    private String name;

    public Location(double lat, double lng, String name) {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getName() {
        return name;
    }
}
