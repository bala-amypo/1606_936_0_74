package com.example.demo.service;

import com.example.demo.entity.StudentsStructure;

public interface StudentServ {

    StudentsStructure saveStudent(StudentsStructure student);

    StudentsStructure getStudentById(int studId);
}