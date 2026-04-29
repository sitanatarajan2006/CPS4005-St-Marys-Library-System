public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private String availabilityStatus;

    public Book(int bookId, String title, String author, String category, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
    this.availabilityStatus = availabilityStatus;
    }
    public int getBookId() {
    return bookId;
}

public String getTitle() {
    return title;
}
