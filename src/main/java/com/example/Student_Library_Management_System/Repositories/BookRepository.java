package com.example.Student_Library_Management_System.Repositories;

import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {




}
