package com.springbits.springwebapp.controllers;

import com.springbits.springwebapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 02/02/19.
 *
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    //Spring will autowire this instantly because it detects BookRepository is a Spring bean
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        //This adds an attribute called books to the model, by fetching the list of books from the repository
        model.addAttribute("books", bookRepository.findAll());
        //This tells SpringMVC to return a view called books
        return "books";
    }
}
