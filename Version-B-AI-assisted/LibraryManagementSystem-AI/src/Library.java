import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully: " + member.getName());
    }

    public void borrowBook(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {

                if (book.getIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }

    public void returnBook(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {

                if (!book.getIsAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }

    public void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }
}