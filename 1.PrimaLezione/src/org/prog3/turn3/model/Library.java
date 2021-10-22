package org.prog3.turn3.model;

import java.sql.Array;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int capacity() {
        return books.size();
    }

    public void printLibrary() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
