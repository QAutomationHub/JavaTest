package serialization.jackson_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class Library {

    private String title;

    private Book [] books;

    public Library(String title, Book[] books) {
        this.title = title;
        this.books = books;
    }

    public Library() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
