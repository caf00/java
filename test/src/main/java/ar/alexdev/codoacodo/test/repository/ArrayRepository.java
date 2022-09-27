package ar.alexdev.codoacodo.test.repository;

import java.util.List;
import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.domain.Repository;

public class ArrayRepository implements Repository{
    
    private List<Book> books;

    private ArrayRepository() {
        fillData();
    }

    public static ArrayRepository newInstance() {
        return new ArrayRepository();
    }
    
    
    @Override
    public List<Book> searchBooks() {
        return books;
    }

    private void fillData() {
        books = List.of(
            Book.newBook("Programación Orientada a Objetos I","Alejandro Fernandez", "Alba"),
            Book.newBook("Programación Orientada a Objetos II", "Roberto Zinni","Alba"),
            Book.newBook("La Biblia de Java", "Mariela Zinni","Atalanta"),
            Book.newBook("Sping Boot - Java", "Daniela Martínez","Atalanta"),
            Book.newBook("Análisis Matemático II", "Cesar Fernandez","Atalanta"),
            Book.newBook("Programación Orientada a Objetos III", "Lucía Pérez","Planeta")
        );
    }
}
