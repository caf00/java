package ar.alexdev.codoacodo.test.filter.impl;

import java.util.List;
import java.util.stream.Collectors;
import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public class FilterByAuthor implements Filter {

    private final String author; 

    private FilterByAuthor(String author) {
        this.author = author;
    }

    public static FilterByAuthor newInstance(String author) {
        return new FilterByAuthor(author);
    }

    @Override
    public List<Book> apply(List<Book> books) {
        return books
            .stream()
            .filter(b -> b.getAuthor().contains(author))
            .collect(Collectors.toList());
    }
}
