package com.wilson.studentApi.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class StudentDao {

    private final List<Student> STUDENTS = new ArrayList<>();


    public Student createStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }


    public Student getStudent(String email) {
        return STUDENTS.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex, student);
            return student;
        }
        return null;
    }


    public List<Student> getAllStudents() {
        return STUDENTS;
    }


    public Student deleteStudent(String email) {
        var student = getStudent(email);
        if(student != null){
            STUDENTS.remove(student);
            return student;
        }
        return null;
    }
}
