package com.book.storage.controllers;


import com.book.storage.dto.AuthorBookDto;
import com.book.storage.services.AuthorBookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthorBookController {
    @Autowired
    AuthorBookServiceInterface authorBookServiceInterface;

    @ResponseBody
    @RequestMapping("addAuthorBook")
    public AuthorBookDto addAuthorBook(@RequestBody AuthorBookDto authorBookDTO) {
        //CALL SERVICE
        AuthorBookDto Results = authorBookServiceInterface.addAuthorBook(authorBookDTO); //RETURN
        return Results;
    }
}
