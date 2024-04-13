import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;

public class Library {
    public HashMap<String, Book> books;
    public HashMap<String, Book> purchasedBooks;
    public HashMap<String, Book> borrowedBooks;
    public Library() {
        books = new HashMap<>();
        purchasedBooks = new HashMap<>();
        borrowedBooks = new HashMap<>();
    }

    // Method to add a book to the library
    public void addBook(String ISBN, String title, String author) {
        Book book = new Book(ISBN, title, author);
        books.put(ISBN, book);
    }
    //Move the book to purchsed books map
    public void purchase(String isbn ){
        Book book = books.get(isbn);
        purchasedBooks.put(isbn, book);
        deleteBook(isbn);
    }
    //Move the book to borrowed books map
    public boolean borrow(String isbn ){
        Book book = books.get(isbn);
        if ( book != null) {
            borrowedBooks.put(isbn, book);
            deleteBook(isbn);
            return true;
        }
        return false;
    }

    // Method to delete a book from the library
    public void deleteBook(String ISBN) {
        books.remove(ISBN);
    }

    public boolean returnBook(String isbn) {
        Book book = borrowedBooks.get(isbn);
        if (book != null) {
            books.put(isbn, book);
            borrowedBooks.remove(isbn, book);
            return true;
        }
        return false;
    }
    public Book[] searchBook(String isbn, String title) {
        ArrayList<Book> results = new ArrayList<>();
        if (!Objects.equals(isbn, "") && Objects.equals(title, "")) {
            Book book = books.get(isbn);
            if (book != null) {
                results.add(book);
            }
        } else if (!Objects.equals(title, "") && Objects.equals(isbn, "")) {
            for (Book book : books.values()) {
                if (calculateTitleMatch(book.getTitle(), title) >= 0.3) {
                    results.add(book);
                }
            }
        }
        return results.toArray(new Book[0]);
    }
    private double calculateTitleMatch(String bookTitle, String searchTitle) {
        int maxLength = Math.max(bookTitle.length(), searchTitle.length());
        int matchCount = 0;
        for (int i = 0; i < Math.min(bookTitle.length(), searchTitle.length()); i++) {
            if (bookTitle.charAt(i) == searchTitle.charAt(i)) {
                matchCount++;
            }
        }
        return (double) matchCount / maxLength;
    }
}
