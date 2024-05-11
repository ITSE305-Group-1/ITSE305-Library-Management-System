import lib.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseBookTest {

    private static LibraryService libraryService;
    private static BookDAO bookDAO;

    @BeforeAll
    public static void setUp() {
        bookDAO = new BookDAOMock();
        libraryService = new LibraryService(bookDAO);
    }

    @Test
    public void testPurchaseBook() {
        // Add a book to the library
        String ISBN = "1234567890";
        String title = "Test Book";
        String author = "Test Author";
        libraryService.addBook(ISBN, title, author);

        // Purchase the book
        libraryService.purchaseBook(ISBN);

        // Check if the book is moved to purchasedBooks and removed from books
        assertNull(bookDAO.getBook(ISBN), "Book should not exist in books after purchase");
        assertNotNull(bookDAO.getPurchasedBook(ISBN), "Book should exist in purchasedBooks after purchase");
    }

    private static class BookDAOMock extends BookDAO {
        @Override
        public Book getPurchasedBook(String ISBN) {
            return getPurchasedBooks().get(ISBN);
        }
    }
}
