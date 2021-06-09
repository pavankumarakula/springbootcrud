package com.example.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootcrud.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
