package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Productlist {

    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("price")
    private String price;
    @SerializedName("discountPercentage")
    private String discountPercentage;
     @SerializedName("rating")
    private String rating;
    @SerializedName("stock")
    private String stock;
    @SerializedName("brand")
    private String brand;
    @SerializedName("category")
    private String category;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("images")
    private ArrayList<String> images;
}
