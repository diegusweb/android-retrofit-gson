package dev.util.com.geotest.rest.api;

import java.util.List;

import dev.util.com.geotest.rest.model.Country;
import retrofit.http.GET;

/**
 * Created by diego.rueda on 8/27/2015.
 */
public interface ApiServiceInterface {

    //@Header("Cache-Control: This is an awesome head")
    @GET("/all")
    List<Country> getCountries();

}
