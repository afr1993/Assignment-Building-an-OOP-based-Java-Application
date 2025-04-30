public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.available = true;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) this.author = author;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isEmpty()) this.isbn = isbn;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public String getDetails() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}
