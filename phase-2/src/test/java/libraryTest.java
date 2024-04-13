import static org.junit.Assert.*;
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
}