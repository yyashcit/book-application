package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entity.Book;

public interface BookStoreRepository extends JpaRepository<Book, Integer>{

}
