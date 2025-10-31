package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        if (city == null) return false;
        return cities.contains(city);
    }
    public void deleteCity(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException("city not in list");
        }
    }

    public int countCities() {
        return cities.size();
    }

}

