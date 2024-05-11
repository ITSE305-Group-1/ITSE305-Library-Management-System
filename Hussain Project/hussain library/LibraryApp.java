import java.util.Scanner;

public class LibraryApp {
    private LibraryService libraryService;

    public LibraryApp(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library System");
        String ISBN, title, author, feedback;
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Purchase Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    ISBN = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    author = scanner.nextLine();
                    feedback = libraryService.addBook(ISBN, title, author);
                    System.out.println(feedback);
                    break;
                case 2:
                    System.out.print("Enter ISBN to purchase: ");
                    ISBN = scanner.nextLine();
                    feedback = libraryService.purchaseBook(ISBN);
                    System.out.println(feedback);
                    break;
                case 3:
                    System.out.print("Enter ISBN to borrow: ");
                    ISBN = scanner.nextLine();
                    feedback = libraryService.borrowBook(ISBN);
                    System.out.println(feedback);
                    break;
                case 4:
                    System.out.print("Enter ISBN to return: ");
                    ISBN = scanner.nextLine();
                    feedback = libraryService.returnBook(ISBN);
                    System.out.println(feedback);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        LibraryService libraryService = new LibraryService(bookDAO);
        LibraryApp app = new LibraryApp(libraryService);
        app.start();
    }
}
