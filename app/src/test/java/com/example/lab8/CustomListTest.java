package com.example.lab8;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

//    changed file

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        Assertions.assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Estevan", "SK");
        Assertions.assertFalse(list.hasCity(city));
        list.addCity(city);
        Assertions.assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        Assertions.assertTrue(list.hasCity(city));
        list.deleteCity(city);
        Assertions.assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        Assertions.assertEquals(0, list.countCities());
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Regina", "SK"));
        Assertions.assertEquals(2, list.countCities());
    }

}
