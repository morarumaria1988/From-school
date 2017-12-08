package lendinglibrary;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    public Book(int bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public int getBookId() {
        return bookId;
    }

//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public String getIsbn() {
        return isbn;
    }

//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
    
}
