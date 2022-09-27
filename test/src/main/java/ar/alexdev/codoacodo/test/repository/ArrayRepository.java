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
            Book.newBook("945-56-3459-238-5","Comunicaciones y Redes de Computadores 7ma edición","William Stallings", "Pearson"),
            Book.newBook("978-45-9078-345-2", "Redes de Computadoras, Un enfoque descendente 7ma edición", "James F. Kurose, Keith W. Ross","Pearson"),
            Book.newBook("965-56-3456-897-5", "Redes de Computadoras 5ta edición", "Tanenbaum, Wetherall","Pearson"),
            Book.newBook("912-76-5467-987-8", "Redes de Computadoras 4ta edición", "Andrew S. Tanenbaum","Pearson"),
            Book.newBook("966-67-2340-651-4", "TCP/IP Illustrated, Volume 1 2nd edition", "Kevin R. Fall, W. Richard Stevens","Addison-Wesley"),
            Book.newBook("967-56-7319-600-1", "Linux in a nutshell", "Ellen Siever, Stephen Figgins, Robert Love, Arnold Robbins","O'Reilly"),
            Book.newBook("900-00-6723-559-5", "Clean Code", "Robert C. Martin","Pearson"),
            Book.newBook("966-99-4532-980-0", "The Clean Coder", "Robert C. Martin","Pearson"),
            Book.newBook("976-90-1123-009-9", "Clean Architecture", "Robert C. Martin","Pearson"),
            Book.newBook("980-90-5490-987-0", "The Software Craftsman", "Robert C. Martin","Pearson")
        );
    }
}
