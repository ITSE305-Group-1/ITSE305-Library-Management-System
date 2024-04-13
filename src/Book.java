public class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean available;


    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.available = true;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return STR."Book{ISBN='\{ISBN}\{'\''}, title='\{title}\{'\''}, author='\{author}\{'\''}, available=\{available}\{'}'}";
    }
}