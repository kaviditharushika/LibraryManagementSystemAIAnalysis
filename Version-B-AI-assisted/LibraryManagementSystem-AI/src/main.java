import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("B001", "Madol Doova" , "Martin Wickramasinghe"));
        library.addBook(new Book("B002", "Hath Pana" , "Kumaratunga Munidasa"));
        library.registerMember(new Member("M001" , "Saduni"));

        System.out.println("\n WELCOME TO THE LIBRARY MANAGEMENT SYSTEM");

        while (true){
            System.out.println("\n1.Display All Books");
            System.out.println("2.Borrow a Book");
            System.out.println("3.Return a Book");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\n Library Books");
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    library.borrowBook(borrowId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Exiting System. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

