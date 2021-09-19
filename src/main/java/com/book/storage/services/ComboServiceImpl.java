package com.book.storage.services;

import com.book.storage.entities.Author;
import com.book.storage.entities.Book;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ComboServiceImpl implements ComboServiceInterface{
    public String getBooks(Author author){
        Set<Book> books = author.getBooks();

        if(books == null){
            return "<h1> No books by this author </h1>";
        }
        String results = "<h2> Books by " + author.getName() + "</h2>";
        for(Book book : books) {
            results += book.getTitle() + "<br>";
        }
        return results;
    }

}
