package com.example.springbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrud.model.Books;
import com.example.springbootcrud.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository booksRepository;
	
	
	//getting all books record by using the method findaAll() of CrudRepository
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<>();  
		booksRepository.findAll().forEach(books1 -> books.add(books1));  
		return books;
	}
	
	//getting a specific record by using the method findById() of CrudRepository
	
	public Books getBooks(int id) {
		return booksRepository.findById(id).get();
	}
	
	//saving a specific record by using the method save() of CrudRepository  
	public void addBooks(Books books){  
	booksRepository.save(books);
	}
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void deleteBooks(int id){  
	booksRepository.deleteById(id);  
	}
	
	//updating a record  
	public void updateBooks(Books books, int bookid){  
	booksRepository.save(books);  
	}  

}
