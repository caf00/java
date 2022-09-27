package ar.alexdev.codoacodo.test.service;

import java.util.List;

import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.filter.Filter;

public interface FindBookService {
    List<Book> execute(Filter filter);
}
