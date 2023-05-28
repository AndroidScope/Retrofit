package com.example.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET ("products")
    Call<ArrayList<Productlist>> getProduct();
}
