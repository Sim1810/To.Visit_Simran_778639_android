package com.example.tovisit_simranjeetkaur_778639_android;

public class FavouritePlace {
    public int id;
    String placeName;
    String address;
    String date;
    public Double longitude;
    public Double latitude;
    public int isVisited;

    public FavouritePlace(int id, String placeName, String address, String date, Double latitude, Double longitude, int isVisited) {

        this.id = id;
        this.placeName = placeName;
        this.address = address;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isVisited = isVisited;

    }
    public int getId() {
        return id;
    }

    public int getIsVisited() {
        return isVisited;
    }


    public String getPlaceName() {return placeName; }
    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

}
