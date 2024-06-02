package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService 
{
	@Autowired
	private BookRepository brepo;
	public void save(Book b)
	{
		brepo.save(b);
	}
	
	public List<Book> getAllbook()
	{
		return brepo.findAll();
	}
	
	public Book getBookById(int id)
	{
		return brepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		brepo.deleteById(id);
	}
	}
	

