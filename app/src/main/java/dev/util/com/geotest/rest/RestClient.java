package dev.util.com.geotest.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import dev.util.com.geotest.rest.api.ApiServiceInterface;
import dev.util.com.geotest.rest.model.Country;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by diego.rueda on 8/27/2015.
 */
public class RestClient {

    //private static ApiServiceInterface apiServiceInterface;
    private static String ROOT = "https://restcountries.eu/rest/v1";

    public List<Country> GetllCountries()
    {
        Gson gson = new GsonBuilder().create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setConverter(new GsonConverter(gson))
                .build();

        ApiServiceInterface service = restAdapter.create(ApiServiceInterface.class);

        List<Country> countryList = service.getCountries();

        return countryList;
    }


}
