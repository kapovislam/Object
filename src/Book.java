import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int yearPublishing;


    public Book(String title, Author author, int yearPublishing) {
        this.title = title;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String toString() {
        return title + " - " + author + "; год издания - " + yearPublishing;
    }

    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Book book = (Book) other;
        return title.equals(book.title) && author.equals(book.author)&&yearPublishing==book.yearPublishing;

    }

    public int hashCode() {
        return Objects.hash(title, author, yearPublishing);
    }
}
