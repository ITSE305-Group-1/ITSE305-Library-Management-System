import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class reportTest {

    @Test
    public void testGenerateReport() {
        // Create a mock library instance
        Library mockLibrary = createMockLibrary();

        // Create a report instance using the mock library
        Report report = new Report(mockLibrary);

        // Expected counts
        int expectedBooksCount = 1;
        int expectedPurchasedCount = 2;
        int expectedBorrowedCount = 1;

        // Call the generateReport() method
        report.generateReport();

        // Check if the report output matches the expected counts
        String expectedReportOutput = "Number of books in the Library: " + expectedBooksCount + "\n"
                + "Number of purchased books: " + expectedPurchasedCount + "\n"
                + "Number of borrowed books: " + expectedBorrowedCount;
        assertEquals(expectedReportOutput, report.generateReport());
    }

    // Method to create a mock library instance
    private Library createMockLibrary() {
        Library mockLibrary = new Library();
        mockLibrary.books = new HashMap<>();
        mockLibrary.purchasedBooks = new HashMap<>();
        mockLibrary.borrowedBooks = new HashMap<>();
        mockLibrary.books.put("ISBN1", new Book("ISBN1", "Book 1", "Author 1"));
        mockLibrary.books.put("ISBN2", new Book("ISBN2", "Book 2", "Author 2"));
        mockLibrary.books.put("ISBN3", new Book("ISBN3", "Book 3", "Author 3"));
        mockLibrary.books.put("ISBN4", new Book("ISBN4", "Book 4", "Author 4"));


        mockLibrary.purchase("ISBN1", "Ali");
        mockLibrary.purchase("ISBN2", "Ali");
        mockLibrary.borrow("ISBN3");
        return mockLibrary;
    }


}
