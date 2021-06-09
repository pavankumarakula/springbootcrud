package com.example.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.model.Books;
import com.example.springbootcrud.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@GetMapping("/books")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@GetMapping("/books/{bookid}")
	private Books getBooks(@PathVariable int bookid) {
		return booksService.getBooks(bookid);
	}
	
	@PostMapping("/books")
	private void addBooks(@RequestBody Books books) {
		booksService.addBooks(books);
	}
	
	@DeleteMapping("/books/{bookid}")
	private void deleteBooks(@PathVariable int bookid) {
		booksService.deleteBooks(bookid);
	}
	
	@PutMapping("/books")
	private void updateBooks(@RequestBody Books books, @PathVariable int bookid) {
		booksService.updateBooks(books, bookid);
	}
	

}
