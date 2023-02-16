package com.example.Student_Library_Management_System.Repositories;

import com.example.Student_Library_Management_System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
