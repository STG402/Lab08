package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity_trueWhenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCity_falseWhenAbsent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity_removesWhenPresent() {
        CustomList list = new CustomList();
        City c1 = new City("Calgary", "AB");
        City c2 = new City("Edmonton", "AB");
        list.addCity(c1);
        list.addCity(c2);

        list.deleteCity(c1);

        assertFalse(list.hasCity(c1));
        assertTrue(list.hasCity(c2));
    }

    @Test
    public void testDeleteCity_throwsWhenAbsent() {
        CustomList list = new CustomList();
        City ghost = new City("Toronto", "ON");
        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(ghost));
    }

}

