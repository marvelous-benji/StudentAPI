package com.wilson.studentApi.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private StudentService studentService;


    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable("email") String email){
        return studentService.getStudent(email);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student newStudent){
        return this.studentService.createStudent(newStudent);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student newStudent){
        return this.studentService.updateStudent(newStudent);
    }

    @DeleteMapping("/{email}")
    public Student deleteStudent(@PathVariable("email") String email){
        return studentService.deleteStudent(email);
    }
}
