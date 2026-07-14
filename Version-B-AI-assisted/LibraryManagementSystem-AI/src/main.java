import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("B001", "Madol Doova", "Martin Wickramasinghe"));
        library.addBook(new Book("B002", "Hath Pana", "Kumaratunga Munidasa"));

        library.registerMember(new Member("M001", "Saduni"));
        library.registerMember(new Member("M002", "Nimal"));

        System.out.println("\nWELCOME TO THE LIBRARY MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("\n1. Display All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

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

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}