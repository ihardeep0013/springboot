package com.example.demo.DAO;

import com.example.demo.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
