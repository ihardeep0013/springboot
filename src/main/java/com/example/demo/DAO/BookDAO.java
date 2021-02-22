package com.example.demo.DAO;

import com.example.demo.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks() {
        return repository.findAll();
    }

    public Book createBook(Book book) { return repository.insert(book); }
}
