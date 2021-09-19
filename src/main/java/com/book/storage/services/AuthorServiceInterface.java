package com.book.storage.services;

import com.book.storage.entities.Author;
import org.springframework.stereotype.Component;

public interface AuthorServiceInterface {
    String addAuthor(Author author);
}
