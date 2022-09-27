package ar.alexdev.codoacodo.test.service.impl;

import java.util.List;

import ar.alexdev.codoacodo.test.domain.Book;
import ar.alexdev.codoacodo.test.domain.Repository;
import ar.alexdev.codoacodo.test.filter.Filter;
import ar.alexdev.codoacodo.test.service.FindBookService;

public class FindBookServiceImpl implements FindBookService{

    private final Repository repository;

    private FindBookServiceImpl(Repository repository) {
        this.repository = repository;
    }

    public static FindBookServiceImpl newInstance(Repository repository) {
        return new FindBookServiceImpl(repository);
    }

    @Override
    public List<Book> execute(Filter filter) {
        return filter.apply(repository.searchBooks());
    }
    
}
