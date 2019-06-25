package com.starter.repo;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.document.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
