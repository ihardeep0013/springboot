package com.example.demo.Controller;

import com.example.demo.Entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

    @RestController
    @RequestMapping("/books")
    public class BookController {
        @Autowired
        private BookService bookService;

        @GetMapping
        public Collection<Book> getBooks() {
            return bookService.getBooks();
        }
}
