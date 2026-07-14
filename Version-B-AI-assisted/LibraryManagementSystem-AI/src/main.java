import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample Data
        library.addBook(new Book("B001", "Madol Doova", "Martin Wickramasinghe"));
        library.addBook(new Book("B002", "Hath Pana", "Kumaratunga Munidasa"));

        library.registerMember(new Member("M001", "Saduni"));
        library.registerMember(new Member("M002", "Nimal"));

        System.out.println("\nWELCOME TO THE LIBRARY MANAGEMENT SYSTEM");

        while (true) {

            System.out.println("\n==============================");
            System.out.println("1. Display All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.println("5. Add a New Book");
            System.out.println("6. Register a New Member");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nLibrary Books");
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    String borrowBookId = scanner.nextLine();

                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();

                    library.borrowBook(borrowBookId, memberId);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    String returnBookId = scanner.nextLine();

                    library.returnBook(returnBookId);
                    break;

                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    scanner.close();
                    System.exit(0);
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    library.addBook(new Book(bookId, title, author));
                    break;

                case 6:
                    System.out.print("Enter Member ID: ");
                    String newMemberId = scanner.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();

                    library.registerMember(new Member(newMemberId, name));
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}