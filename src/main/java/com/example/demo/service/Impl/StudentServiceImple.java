package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFound;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImple implements StudentServ {

    @Autowired
    private StudentRepo repository;
    
    @Transactional
    @Override
    public StudentsStructure saveStudent(StudentsStructure student) {
        repository.save(student);
        if(student.getEmail().equals("kasv@gmail.com")){
        throw new ResourceNotFound("NetWork issue or Server issue");

        }
        return student;
        
    }

    @Override
    public StudentsStructure getStudentById(int studId) {
        return repository.findById(id).orElse(null);
    }
}