package com.example.demo.service;

import com.example.demo.entity.StudentStructure;

public interface StudentServ {

    StudentStructure saveStudent(StudentStructure student);

    StudentStructure getStudentById(int id);
}