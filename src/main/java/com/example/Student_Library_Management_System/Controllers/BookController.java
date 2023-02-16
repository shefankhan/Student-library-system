package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.Models.Books;
import com.example.Student_Library_Management_System.Services.BookService;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Books books){
        return bookService.addBook(books);



    }
}
