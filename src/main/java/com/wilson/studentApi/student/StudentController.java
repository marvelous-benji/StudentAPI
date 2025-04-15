package com.wilson.studentApi.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private StudentService students;


    public StudentController(StudentService students){
        this.students = students;
    }

    @GetMapping
    public List<Student> getStudents(){
        return students.getAllStudents();
    }
}
