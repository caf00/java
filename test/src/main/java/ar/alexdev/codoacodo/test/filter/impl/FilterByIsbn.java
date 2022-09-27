package ar.alexdev.codoacodo.test.filter.impl;

import java.util.List;
import java.util.stream.Collectors;

import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public class FilterByIsbn implements Filter {

    private final String isbn;

    private FilterByIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static FilterByIsbn newInstance(String isbn) {
        return new FilterByIsbn(isbn);
    }

    @Override
    public List<Book> apply(List<Book> books) {
        return books
            .stream()
            .filter(b -> b.getIsbn().contains(isbn))
            .collect(Collectors.toList());
    }
    
}
