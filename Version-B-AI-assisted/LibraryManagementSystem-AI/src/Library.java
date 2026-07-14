public class Library {
    private Book[] books;
    private Member[] members;
    private int bookCount;
    private int memberCount;

    public Library(){
        books = new Book[100];
        members = new Member[100];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book){
        if (bookCount < books.length){
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully: " + book.getTitle());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void registerMember(Member member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
            System.out.println("Member registered successfully: " + member.getName());
        } else {
            System.out.println("Library member limit reached!");
        }
    }

    public void borrowBook(String bookId){
        for (int i = 0; i < bookCount; i++){
            if (books[i].getBookId().equals(bookId)){
                if (books[i].getIsAvailable()) {
                    books[i].setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(String bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId().equals(bookId)) {
                if (!books[i].getIsAvailable()) {
                    books[i].setAvailable(true);
                    System.out.println("Book returned successfully!");
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
    }
}