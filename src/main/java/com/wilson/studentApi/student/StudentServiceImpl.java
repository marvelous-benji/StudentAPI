package com.wilson.studentApi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.createStudent(student);
    }

    @Override
    public Student getStudent(String email) {
        return studentDao.getStudent(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student deleteStudent(String email) {
        return studentDao.deleteStudent(email);
    }
}
