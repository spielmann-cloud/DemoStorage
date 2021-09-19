package com.book.storage.controllers;
import com.book.storage.entities.Author;
import com.book.storage.entities.Book;
import com.book.storage.repositories.AuthorRepository;
import com.book.storage.services.ComboServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@Controller
public class ComboController {

    @Autowired
    ComboServiceInterface comboService;

    @Autowired
    AuthorRepository authorRepository;


    @RequestMapping("/GetBooksForm")
    public String getBooksForm(){
        return "GetBooksForm";
    }

    @ResponseBody
    @RequestMapping("/GetBooks")
    public String getBooks(@RequestParam Integer authorId){

        Optional<Author> authorOptional = authorRepository.findById(authorId);
        if(!authorOptional.isPresent()){
            return "<h1> No such author found </h1>";
        }

        Author author = authorOptional.get();
        return comboService.getBooks(author);
    }
}
