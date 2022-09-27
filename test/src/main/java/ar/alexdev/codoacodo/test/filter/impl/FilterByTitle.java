package ar.alexdev.codoacodo.test.filter.impl;

import java.util.List;
import java.util.stream.Collectors;
import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public class FilterByTitle implements Filter{

    private final String title;

    private FilterByTitle(String title) {
        this.title = title;
    }

    public static FilterByTitle newInstance(String title) {
        return new FilterByTitle(title);
    }

    @Override
    public List<Book> apply(List<Book> books) {
        return books
            .stream()
            .filter(b -> b.getTitle().contains(title))
            .collect(Collectors.toList());
    }
    
}
