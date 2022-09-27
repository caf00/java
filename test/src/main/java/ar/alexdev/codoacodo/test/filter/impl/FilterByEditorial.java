package ar.alexdev.codoacodo.test.filter.impl;

import java.util.List;
import java.util.stream.Collectors;

import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public class FilterByEditorial implements Filter{

    private final String editorial;

    private FilterByEditorial(String editorial) {
        this.editorial = editorial;
    }

    public static FilterByEditorial newInstance(String editorial) {
        return new FilterByEditorial(editorial);
    }

    @Override
    public List<Book> apply(List<Book> books) {
        return books
            .stream()
            .filter(b -> b.getEditorial().contains(editorial))
            .collect(Collectors.toList());
    }
    
}
