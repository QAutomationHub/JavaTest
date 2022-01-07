package serialization.jackson_demo;

public class Book {

    private String author;

    private String title;

    private int pages;

    private int year;

    public Book(String author, String title, int pages, int year) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
