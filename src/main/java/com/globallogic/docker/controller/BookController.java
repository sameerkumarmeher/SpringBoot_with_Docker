package com.globallogic.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.docker.model.Book;
import com.globallogic.docker.repository.BookRepository;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book)
	{
		return bookRepository.save(book);
	}
	
	@GetMapping("/book")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
}
