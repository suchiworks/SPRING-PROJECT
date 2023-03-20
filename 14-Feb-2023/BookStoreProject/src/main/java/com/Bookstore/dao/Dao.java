package com.Bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bookstore.entity.Book;

public interface Dao extends JpaRepository<Book, Integer> {

}
