package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.StudentsStructure;
import com.example.demo.repository.StudentRepo;
import com.example.demo.exception.ResourceNotFound;

import java.util.List;

@Service
public class StudentServiceImple implements StudentServ {

    @Autowired
    private StudentRepo repository;

    @Transactional
    @Override
    public StudentsStructure saveStudent(StudentsStructure student) {
        repository.save(student);

        if ("kasv@gmail.com".equals(student.getStuEmail())) {
            throw new ResourceNotFound("Network issue or Server issue");
        }

        return student;
    }

    @Override
    public StudentsStructure getStudentById(int studId) {
        return repository.findById(studId).orElse(null);
    }

    @Override
    public List<StudentsStructure> getBysingleEmail(String Email) {
        return repository.findByEmail(Email);
    }
}
