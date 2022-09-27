package ar.alexdev.codoacodo.test.domain;

public class Book {
    private String title;
    private String author;
    private String editorial;

    

    public Book(String title, String author, String editorial) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
    }

    public static Book newBook(String title, String author, String editorial) {
        return new Book(title, author, editorial);
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
        return "Book [author=" + author + ", editorial=" + editorial + ", title=" + title + "]";
    }

}
