package com.book.storage.services;

import com.book.storage.entities.Author;
import com.book.storage.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorServiceImpl implements AuthorServiceInterface{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author: " + author.getName() + " added";
    }
}
