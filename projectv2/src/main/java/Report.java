package main.java;

public class Report {
    private int purchasedCount;
    private int borrowedCount;
    private int booksCount;

    public Report(Library lib){
        purchasedCount = lib.purchasedBooks.size();
        borrowedCount = lib.borrowedBooks.size();
        booksCount = lib.books.size();

    }
    //Return the info about how many books in the library, and how many has been purchased and borrowed
    public  String generateReport(){
        String report= "Number of books in the Library: "+booksCount+"\n"
        +"Number of purchased books: "+purchasedCount+"\n"
        +"Number of borrowed books: "+borrowedCount;
        return  report;
    }
}
