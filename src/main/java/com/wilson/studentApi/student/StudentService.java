package com.wilson.studentApi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        "Ali",
                        "Kudus",
                        LocalDate.now(),
                        "test@test.com",
                        24
                ),
                new Student(
                        "Josh",
                        "Wiles",
                        LocalDate.now(),
                        "test1@test.com",
                        20
                ),
                new Student(
                        "Khalid",
                        "Lahm",
                        LocalDate.now(),
                        "test2@test.com",
                        26
                )
        );
    }
}
