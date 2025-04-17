package com.wilson.studentApi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    Student createStudent(Student student);

    Student getStudent(String email);

    Student updateStudent(Student student);

    List<Student> getAllStudents();

    Student deleteStudent(String email);

}
