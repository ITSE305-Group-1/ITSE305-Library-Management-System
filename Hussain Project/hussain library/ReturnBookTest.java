import lib.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReturnBookTest {

    private static LibraryService libraryService;
    private static BookDAO bookDAO;

    @BeforeAll
    public static void setUp() {
        bookDAO = new BookDAOMock();
        libraryService = new LibraryService(bookDAO);
    }

    @Test
    public void testReturnBook() {
        // Add a book to the borrowedBooks
        String ISBN = "1234567890";
        String title = "Test Book";
        String author = "Test Author";
        libraryService.addBook(ISBN, title, author);
        libraryService.borrowBook(ISBN);
        assertNull(bookDAO.getBook(ISBN), "Book should not exist in books after borrowed");
        // Return the book

        libraryService.returnBook(ISBN);
        assertNotNull(bookDAO.getBook(ISBN), "Book should exist in books after return");

        // Check if the book is moved back to books from borrowedBooks
        assertNull(bookDAO.getBorrowedBook(ISBN), "Book should not exist in borrowedBooks after return");
    }

    private static class BookDAOMock extends BookDAO {
        @Override
        public Book getBorrowedBook(String ISBN) {
            return getBorrowedBooks().get(ISBN);
        }
    }
}
