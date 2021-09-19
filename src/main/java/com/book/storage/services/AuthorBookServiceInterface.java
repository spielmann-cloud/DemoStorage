package com.book.storage.services;


import com.book.storage.dto.AuthorBookDto;

public interface AuthorBookServiceInterface {
    AuthorBookDto addAuthorBook(AuthorBookDto authorBookDTO);
}