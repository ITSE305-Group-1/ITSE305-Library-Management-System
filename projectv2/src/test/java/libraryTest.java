package test.java;

import static org.junit.Assert.*;

import main.java.Library;
import main.java.User;
import org.junit.Before;
import org.junit.Test;

public class libraryTest {
    private Library lib;

    @Before
    public void setUp() {
        lib = new Library();
    }

    @Test
    public void testAddBook() {
        // Add a book
        lib.addBook("1234567890", "Book Title", "Author Name");

        // Check if the book was added
        assertTrue(lib.books.containsKey("1234567890"));
    }

    @Test
    public void testPurchase() {
        // Add a book
        lib.addBook("1234567890", "Book Title", "Author Name");

        // Purchase the book
        lib.purchase("1234567890", "Ali");

        // Check if the book was moved to purchasedBooks
        assertTrue(lib.purchasedBooks.containsKey("1234567890"));

        // Check if the book was removed from books
        assertFalse(lib.books.containsKey("1234567890"));
    }

    @Test
    public void testBorrow() {
        // Add a book
        lib.addBook("1234567890", "Book Title", "Author Name");

        // Borrow the book
        lib.borrow("1234567890");

        // Check if the book was moved to borrowedBooks
        assertTrue(lib.borrowedBooks.containsKey("1234567890"));

        // Check if the book was removed from books
        assertFalse(lib.books.containsKey("1234567890"));
    }

    @Test
    public void testDeleteBook() {
        // Add a book
        lib.addBook("1234567890", "Book Title", "Author Name");

        // Delete the book
        lib.deleteBook("1234567890");

        // Check if the book was deleted
        assertFalse(lib.books.containsKey("1234567890"));
    }
    @Test
    public void testAuthenticate() {
        // Create a new Library instance
        Library library = new Library();
        User admin = new User("Ali", "123");
        // Add a user to the library
        library.users.put("username", new User("username", "password"));

        // Test valid authentication
        assertTrue(admin.authenticate("username", "password"));

        // Test invalid authentication with wrong password
        assertFalse(admin.authenticate("username", "wrong_password"));

        // Test invalid authentication with non-existent username
        assertFalse(admin.authenticate("non_existent_username", "password"));
    }

    @Test
    public void testCheckoutBook() {
        // Create a new Library instance
        Library library = new Library();
        //create user
        User admin = new User("Ali", "123");
        // Add a book to the library
        library.addBook("1234567890", "Book Title", "Author Name");

        // Try to check out the same book again
        assertFalse(admin.authenticate("username", "password")); // Assuming this user exists
        library.checkoutBook(library.books.get("1234567890"),"username");
    }
}