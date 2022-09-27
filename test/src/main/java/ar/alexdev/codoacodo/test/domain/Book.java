package ar.alexdev.codoacodo.test.domain;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private String editorial;

    

    public Book(String isbn, String title, String author, String editorial) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
    }

    public static Book newBook(String isbn, String title, String author, String editorial) {
        return new Book(isbn, title, author, editorial);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "ISBN= " + isbn + ", TITLE= " + title +", AUTHOR= " + author + ", EDITORIAL= " + editorial;
    }       
}
