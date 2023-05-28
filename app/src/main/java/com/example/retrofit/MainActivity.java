package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
private Retrofit mclient;
private Api api;
    private String c,b,zzzz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mclient=APIClient.getclient();
       api= mclient.create(Api.class);
       fetchData();
    }
    void add1(){
zzzz="zzzz";
    }
    void fetchData(){
        api.getProduct().enqueue(new Callback<ArrayList<Productlist>>() {
            @Override
            public void onResponse(Call<ArrayList<Productlist>> call, Response<ArrayList<Productlist>> response) {
               c=0;
            }

            @Override
            public void onFailure(Call<ArrayList<Productlist>> call, Throwable t) {

            }
        });
    }
}
