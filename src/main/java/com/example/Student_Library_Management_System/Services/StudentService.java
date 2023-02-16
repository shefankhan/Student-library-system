package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import com.example.Student_Library_Management_System.Models.Card;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service

public class StudentService {
@Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){


        Card card1=new Card();
        card1.setCardStatus(CardStatus.ACTIVATED);
        card1.setStudentVariableName(student);

        student.setCard(card1);

        studentRepository.save(student);
        return "student and card added";
    }
}
