package com.example.alex_pc.testprojectformotmom;

/**
 * Created by nort3 on 26.11.2017.
 */

public class OfficesList {

    private class Addresses{
        private String address;
        private double latitude;
        private double longitude;
        private String schedule;

        public Addresses(String address, double latitude, double longitude, String schedule) {
            this.address = address;
            this.latitude = latitude;
            this.longitude = longitude;
            this.schedule = schedule;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public String getSchedule() {
            return schedule;
        }

        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }
    }
    private Addresses address;
    private int id;
    private String image;
    private String longDescription;
    private String name;
    private float raing;
    private String shortDescription;

    public OfficesList(int id, String image, String longDescription, String name, float raing, String shortDescription) {
        this.id = id;
        this.image = image;
        this.longDescription = longDescription;
        this.name = name;
        this.raing = raing;
        this.shortDescription = shortDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRaing() {
        return raing;
    }

    public void setRaing(float raing) {
        this.raing = raing;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}