package ar.alexdev.codoacodo.test.filter.impl;

import java.util.List;

import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public class NoneFilter implements Filter{

    private NoneFilter() {
    }

    public static NoneFilter newIntance() {
        return new NoneFilter();
    }

    @Override
    public List<Book> apply(List<Book> books) {
        return books;
    }
    
}
