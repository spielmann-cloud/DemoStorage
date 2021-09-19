package com.book.storage.services;



import com.book.storage.dto.AuthorBookDto;
import com.book.storage.entities.Author;
import com.book.storage.entities.Book;
import com.book.storage.repositories.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class AuthorBookServiceImpl implements AuthorBookServiceInterface{
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public AuthorBookDto addAuthorBook(AuthorBookDto authorBookDto){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Book book = modelMapper.map(authorBookDto, Book.class);
        Author author = modelMapper.map(authorBookDto, Author.class);

        if(author.getBooks() == null)
            author.setBooks(new HashSet<Book>());
        author.getBooks().add(book);

        //Save and thus Book will also be saved
        authorRepository.save(author);

        //Update DTO
        authorBookDto.setAuthorId(author.getId());
        authorBookDto.setBookId(book.getId());



        return authorBookDto;
    }


}
