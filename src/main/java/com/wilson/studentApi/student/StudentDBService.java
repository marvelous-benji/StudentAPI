package com.wilson.studentApi.student;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDBService implements StudentService{

    private final StudentRepository repository;

    public StudentDBService(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudent(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Student deleteStudent(String email) {
        Student student = repository.findByEmail(email);
        if(student != null){
            repository.deleteByEmail(email);
        }

        return student;
    }
}
