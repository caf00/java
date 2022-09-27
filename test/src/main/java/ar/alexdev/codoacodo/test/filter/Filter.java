package ar.alexdev.codoacodo.test.filter;

import java.util.List;

import ar.alexdev.codoacodo.test.domain.Book;

public interface Filter {
    List<Book> apply(List<Book> books);
}