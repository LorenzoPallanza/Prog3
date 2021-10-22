package org.prog3.turn3.model;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @org.junit.jupiter.api.Test
    void addBook() {
        assertEquals(0, library.books.size());
        library.addBook(new Book("La divina commedia", "Dante Alighieri", 1000));
        assertEquals(1, library.books.size());
    }

    @org.junit.jupiter.api.Test
    void capacity() {
    }

    @org.junit.jupiter.api.Test
    void printLibrary() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}