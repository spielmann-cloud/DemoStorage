package com.book.storage.services;

import com.book.storage.entities.Book;
import com.book.storage.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServiceInterface {
    @Autowired
    BookRepository bookRepository; public String addBook(Book book) {
        bookRepository.save(book);
        return "Book" + book.getTitle()+ " added to DB";
    }
}
