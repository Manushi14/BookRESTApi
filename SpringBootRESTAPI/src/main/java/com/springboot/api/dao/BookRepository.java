package com.springboot.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.api.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public Book findById(int id);
}
