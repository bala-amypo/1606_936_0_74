package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentStructure;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImple implements StudentServ {

    @Autowired
    private StudentRepo repository;

    @Override
    public StudentStructure saveStudent(StudentStructure student) {
        return repository.save(student);
    }

    @Override
    public StudentStructure getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
}