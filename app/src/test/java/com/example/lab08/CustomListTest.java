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
}

