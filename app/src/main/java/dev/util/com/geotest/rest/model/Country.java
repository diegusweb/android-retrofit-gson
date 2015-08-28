package dev.util.com.geotest.rest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by diego.rueda on 8/27/2015.
 */
public class Country {
    @SerializedName("name")
    String Name;

    @SerializedName("capital")
    String Capital;

    @SerializedName("region")
    String Region;

    @SerializedName("subregion")
    String SubRegion;

    @SerializedName("population")
    int Population;

    @SerializedName("demonym")
    String Demonym;

    @SerializedName("timezones")
    List<String> TimeZones;

    @SerializedName("borders")
    List<String> Borders;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getSubRegion() {
        return SubRegion;
    }

    public void setSubRegion(String subRegion) {
        SubRegion = subRegion;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getDemonym() {
        return Demonym;
    }

    public void setDemonym(String demonym) {
        Demonym = demonym;
    }

    public List<String> getTimeZones() {
        return TimeZones;
    }

    public void setTimeZones(List<String> timeZones) {
        TimeZones = timeZones;
    }

    public List<String> getBorders() {
        return Borders;
    }

    public void setBorders(List<String> borders) {
        Borders = borders;
    }
}
