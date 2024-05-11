import lib.Book;

public class LibraryService {
    private BookDAO bookDAO;

    public LibraryService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public String addBook(String ISBN, String title, String author) {
        Book book = new Book(ISBN, title, author);
        return bookDAO.addBook(book);
    }

    public String deleteBook(String ISBN) {
        return bookDAO.deleteBook(ISBN);
    }

    public String purchaseBook(String ISBN) {
        return bookDAO.purchaseBook(ISBN);
    }

    public String borrowBook(String ISBN) {
        return bookDAO.borrowBook(ISBN);
    }

    public String returnBook(String ISBN) {
        return bookDAO.returnBook(ISBN);
    }
}

