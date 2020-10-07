package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone = new Smartphone(5, "Galaxy A50", 500, "Samsung Electronics");

    @Test
    void matchesName() {

        boolean actual = smartphone.matches("Galaxy A50");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void matchesMaker() {

        boolean actual = smartphone.matches("Samsung Electronics");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}