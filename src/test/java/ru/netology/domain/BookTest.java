package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book = new Book(1, "American Gods", 100, "Neil Gainman");

    @Test
    void matchesName() {

        boolean actual = book.matches("American Gods");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void matchesAuthor() {

        boolean actual = book.matches("Neil Gainman");
        boolean expected = true;

        assertEquals(expected, actual);
    }

}