package com.example.springboot.service;

import com.example.springboot.model.Student;
import com.example.springboot.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void add(Student student) {
        repo.save(student);
    }


    public List<Student> listAllStudents() {
        return repo.findAll();
    }
}
