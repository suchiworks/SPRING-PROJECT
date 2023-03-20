package com.Bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookstore.dao.Dao;
import com.Bookstore.entity.Book;

@Service
public class BookServiceImpl implements BookServices {

	@Autowired
	private Dao dao;
//adding
	@Override
	public Book addBook(Book obj) {
		return dao.save(obj);
	}
//get one id
	@Override
	public Book getBook(int id) {
		return dao.findById(id).orElse(null);
	}
//find all
	@Override
	public List<Book> getBooks() {
		return dao.findAll();
	}

//delete
	@Override
	public Book deleteBook(int id) {
		dao.deleteById(id);
		return null;
	}
//Update
	@Override
	public Book updateBook(Book id) {
	// TODO Auto-generated method stub
	    return dao.save(id);
		//return null;
	}

}
