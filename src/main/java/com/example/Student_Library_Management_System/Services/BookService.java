package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.Enums.genre;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Books;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import com.example.Student_Library_Management_System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Books book){

         // i want to get the authorEntity
        int authorId= book.getAuthor().getId();

         // now fetch the author entity

        Author author=authorRepository.findById(authorId).get();

        book.setAuthor(author);

        List<Books> currentBooksWritten = author.getBooksWritten();
        currentBooksWritten.add(book);


        authorRepository.save(author);




        return "books added successfully";
    }
}
