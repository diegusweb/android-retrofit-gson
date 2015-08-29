package com.util.diegus.retrofit_test.rest.api;

import com.util.diegus.retrofit_test.rest.model.Country;

import java.util.List;

import retrofit.http.GET;

/**
 * Created by HP on 28/08/2015.
 */
public interface ApiInterface {
    @GET("/all")
    List<Country> getCountries();
}
