public class Book {

    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    private Member borrowedBy;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowedBy = null;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Member getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Member borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public void displayInfo() {

        System.out.print(
                "ID: " + bookId +
                        " | Title: " + title +
                        " | Author: " + author +
                        " | Status: " + (isAvailable ? "Available" : "Borrowed")
        );

        if (!isAvailable && borrowedBy != null) {
            System.out.print(" | Borrowed By: " + borrowedBy.getName());
        }

        System.out.println();
    }
}