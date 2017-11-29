package com.example.alex_pc.testprojectformotmom;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfficesList {

    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("imageHref")
    @Expose
    private String imageHref;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rating")
    @Expose
    private float rating;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageHref() {
        return imageHref;
    }

    public void setImageHref(String imageHref) {
        this.imageHref = imageHref;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return "OfficesList{" +
                "addresses=" + addresses +
                ", id='" + id + '\'' +
                ", imageHref='" + imageHref + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}