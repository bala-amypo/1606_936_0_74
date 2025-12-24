package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImple implements StudentServ {

    @Autowired
    private StudentRepo repository;

    @Override
    public StudentsStructure saveStudent(StudentsStructure student) {
        return repository.save(student);
        throw new ResourceNotFound("NetWork issue or Server issue");
    }

    @Override
    public StudentsStructure getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
}