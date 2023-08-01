package com.globallogic.docker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.docker.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
