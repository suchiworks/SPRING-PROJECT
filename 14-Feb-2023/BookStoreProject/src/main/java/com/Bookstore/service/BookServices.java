package com.Bookstore.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.Bookstore.entity.Book;

@Component
public interface BookServices {

	// add
	public Book addBook(Book obj);
    //single id
	public Book getBook(int id);
    //all id
	public List<Book> getBooks();
	// delete
	public Book deleteBook(int id);
	// update a customer details
	public Book updateBook(Book id);
}
