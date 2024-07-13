package test;

import org.example.models.BookAdrian;
import org.example.models.LibraryAdrian;

public class TestAdrian {

        public static void main(String[] args) {

            BookAdrian bookAdrian1 = new BookAdrian("Effective Java", "Joshua Bloch", "9780134685991");
            BookAdrian bookAdrian2 = new BookAdrian("Clean Code", "Robert C. Martin", "9780132350884");
            BookAdrian bookAdrian3 = new BookAdrian("Design Patterns", "Erich Gamma", "9780201633610");


            LibraryAdrian libraryAdrian = new LibraryAdrian();
            libraryAdrian.addBook(bookAdrian1);
            libraryAdrian.addBook(bookAdrian2);
            libraryAdrian.addBook(bookAdrian3);


            System.out.println("All books in the library:");
            for (BookAdrian bookAdrian : libraryAdrian.getAllBooks()) {
                System.out.println(bookAdrian.getTitle() + " by " + bookAdrian.getAuthor());
            }


            String isbnToSearch = "9780132350884";
            BookAdrian foundBookAdrian = libraryAdrian.findBookByIsbn(isbnToSearch);
            if (foundBookAdrian != null) {
                System.out.println("\nFound book with ISBN " + isbnToSearch + ": " + foundBookAdrian.getTitle() + " by " + foundBookAdrian.getAuthor());
            } else {
                System.out.println("\nNo book found with ISBN " + isbnToSearch);
            }


            libraryAdrian.removeBook(bookAdrian2);
            System.out.println("\nBooks in the library after removing 'Clean Code':");
            for (BookAdrian bookAdrian : libraryAdrian.getAllBooks()) {
                System.out.println(bookAdrian.getTitle() + " by " + bookAdrian.getAuthor());
            }
        }
    }


