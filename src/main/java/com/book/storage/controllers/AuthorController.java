package com.book.storage.controllers;

import com.book.storage.entities.Author;
import com.book.storage.repositories.AuthorRepository;
import com.book.storage.services.AuthorServiceImpl;
import com.book.storage.services.AuthorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@Controller
public class AuthorController {


    @Autowired AuthorServiceInterface authorService;

    @RequestMapping("/AddAuthorForm")
    public String addAuthorForm(){
        return "AddAuthorForm";
    }

    @ResponseBody
    @RequestMapping("/AddAuthor")

    public String addAuthor(@RequestParam String name, @RequestParam Integer age, @RequestParam Date birthday){

        Author author = new Author();
        author.setName(name);
        author.setAge(age);
        author.setBirthday(birthday);

        return authorService.addAuthor(author);

    }


}
