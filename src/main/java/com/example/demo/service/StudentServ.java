package com.example.demo.service;

import com.example.demo.entity.StudentsStructure;
import java.util.List;


public interface StudentServ {

    StudentsStructure saveStudent(StudentsStructure student);

    StudentsStructure getStudentById(int studId);
     List<StudentsStructure>getStudentByEmail(String stuEmail);
}