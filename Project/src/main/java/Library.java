import java.util.*;

public class Library {
    public HashMap<String, Book> books;
    public HashMap<String, Book> purchasedBooks;
    public HashMap<String, Book> borrowedBooks;
    public HashMap<String, User> users;
    public Library() {
        books = new HashMap<>();
        purchasedBooks = new HashMap<>();
        borrowedBooks = new HashMap<>();
        users = new HashMap<>();
    }

    // Method to add a book to the library
    public void addBook(String ISBN, String title, String author) {
        Book book = new Book(ISBN, title, author);
        books.put(ISBN, book);
    }
    // Method to delete a book from the library
    public void deleteBook(String ISBN) {
        books.remove(ISBN);
    }
    //Move the book to purchased books map
    public void purchase(String isbn, String userName ){
        checkoutBook(books.get(isbn), userName);
        Book book = books.get(isbn);
        purchasedBooks.put(isbn, book);
        deleteBook(isbn);
    }
    //Move the book to borrowed books map
    public void borrow(String isbn ){
        Book book = books.get(isbn);
        borrowedBooks.put(isbn, book);
        deleteBook(isbn);
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
    // Method to checkout a book
    public void checkoutBook(Book book, String userName) {

        if (book != null && book.isAvailable()) {
            System.out.println("Book with ISBN " + book.getISBN() + " checked out by " + userName);
        } else {
            System.out.println("Book not available for checkout");
        }
    }
    // Method for user authentication
    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password) && user.getUsername().equals(username);
    }


}
