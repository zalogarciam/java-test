package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class LibraryAdrian {
    private List<BookAdrian> bookAdrians;

    public LibraryAdrian() {
        bookAdrians = new ArrayList<>();
    }

    public void addBook(BookAdrian bookAdrian) {
        bookAdrians.add(bookAdrian);
    }

    public void removeBook(BookAdrian bookAdrian) {
        bookAdrians.remove(bookAdrian);
    }

    public List<BookAdrian> getAllBooks() {
        return new ArrayList<>(bookAdrians);  // Devolver una copia para evitar modificaciones externas
    }

    public BookAdrian findBookByIsbn(String isbn) {
        for (BookAdrian bookAdrian : bookAdrians) {
            if (bookAdrian.getIsbn().equals(isbn)) {
                return bookAdrian;
            }
        }
        return null;  // Si no se encuentra el libro
    }
}
