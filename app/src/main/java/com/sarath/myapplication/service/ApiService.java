package com.sarath.myapplication.service;

import com.sarath.myapplication.model.Restaurant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("5dfccffc310000efc8d2c1ad")
    Call<List<Restaurant>> getDataList();
}
