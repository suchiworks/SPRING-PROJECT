package com.Bookstore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Bookstore.entity.Book;
import com.Bookstore.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	private BookServiceImpl impl;

	// show book management
		@GetMapping("/books")
		public List<Book> getAllBooks() {
			return impl.getBooks();
		}
	// Add books
	@PostMapping("/books")
	public Book addBookInDB(@RequestBody Book obj) {
		return impl.addBook(obj);
	}
	//single id
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable int id) {
		return impl.getBook(id);
	}
    //delete
	@DeleteMapping("/deletebooks/{id}")
	public Book deleteBook(@PathVariable int id) {
		return impl.deleteBook(id);
	}
	//PutMapping for update a customer details
		@PutMapping("/books/{id}")
		public Book updateBook(@RequestBody Book id) {
			return impl.updateBook(id);
		}

}
