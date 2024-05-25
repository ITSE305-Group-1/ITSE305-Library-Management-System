package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample data
        library.addBook("123", "Effective Java", "Joshua Bloch");
        library.addBook("456", "Clean Code", "Robert C. Martin");
        library.addBook("789", "The Pragmatic Programmer", "Andrew Hunt");

        User user1 = new User("john_doe", "password123");
        library.users.put(user1.getUsername(), user1);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Purchase Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Search Book");
            System.out.println("6. Generate Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String addIsbn = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String addTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String addAuthor = scanner.nextLine();
                    library.addBook(addIsbn, addTitle, addAuthor);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter ISBN to delete: ");
                    String deleteIsbn = scanner.nextLine();
                    library.deleteBook(deleteIsbn);
                    System.out.println("Book deleted successfully.");
                    break;
                case 3:
                    System.out.print("Enter ISBN to purchase: ");
                    String purchaseIsbn = scanner.nextLine();
                    System.out.print("Enter Username: ");
                    String purchaseUsername = scanner.nextLine();
                    library.purchase(purchaseIsbn, purchaseUsername);
                    System.out.println("Book purchased successfully.");
                    break;
                case 4:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrow(borrowIsbn);
                    System.out.println("Book borrowed successfully.");
                    break;
                case 5:
                    System.out.print("Enter ISBN to search (leave empty to search by title): ");
                    String searchIsbn = scanner.nextLine();
                    System.out.print("Enter Title to search (leave empty to search by ISBN): ");
                    String searchTitle = scanner.nextLine();
                    Book[] results = library.searchBook(searchIsbn, searchTitle);
                    if (results.length > 0) {
                        System.out.println("Search Results:");
                        for (Book book : results) {
                            System.out.println("ISBN: " + book.getISBN() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
                        }
                    } else {
                        System.out.println("No books found.");
                    }
                    break;
                case 6:
                    Report report = new Report(library);
                    System.out.println(report.generateReport());
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting the Library System. Goodbye!");
    }
}
