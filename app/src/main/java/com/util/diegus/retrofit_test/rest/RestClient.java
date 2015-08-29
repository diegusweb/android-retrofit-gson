package com.util.diegus.retrofit_test.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.util.diegus.retrofit_test.rest.api.ApiInterface;
import com.util.diegus.retrofit_test.rest.model.Country;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by HP on 28/08/2015.
 */
public class RestClient {
    //private static ApiServiceInterface apiServiceInterface;
    private static String ROOT = "https://restcountries.eu/rest/v1";

    public List<Country> GetAllCountries() {

        Gson gson = new GsonBuilder().create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setConverter(new GsonConverter(gson))
                .build();

        ApiInterface service = restAdapter.create(ApiInterface.class);

        List<Country> countrylist = service.getCountries();

        return countrylist;
    }

}
