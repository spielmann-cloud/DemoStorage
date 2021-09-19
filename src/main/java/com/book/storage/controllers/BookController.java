package com.book.storage.controllers;


import com.book.storage.entities.Book;
import com.book.storage.repositories.BookRepository;
import com.book.storage.services.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    BookServiceInterface bookService;

    @RequestMapping("/AddBookForm")
    public String addBookForm(){
        return "AddBookForm";
    }

    @ResponseBody
    @RequestMapping("/AddBook")
    public String addBook(@RequestParam String title, @RequestParam Integer authorId){
        Book book = new Book();

        book.setTitle(title);
        book.setAuthorId(authorId);

       return bookService.addBook(book);
    }

}
