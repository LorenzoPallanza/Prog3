package org.prog3.turn3.main;

import org.prog3.turn3.model.Book;
import org.prog3.turn3.model.Library;

public class RunLibrary {
    //TODO: fare refactoring
    public static void main(String[] args) {
        Library library = createLibrary();
        library.printLibrary();
    }

    private static Library createLibrary() {
        Library library = new Library();
        library.addBook(new Book("La divina commedia", "Dante Alighieri", 1000));
        library.addBook(new Book("I Malavoglia", "Autore", 2387));
        library.addBook(new Book("Gattopardo", "Gatto", 236));
        return library;
    }
}
