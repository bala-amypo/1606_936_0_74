package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentDetailsService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


import jakarta.validation.Valid;

import java.util.List;



@RestController
public class StudentController{
   @Autowired StudentService ser;
   @PostMapping("/post")
   public StudentEntity senddata(@RequestBody StudentEntity stu){
          return ser.postdata(stu);

   }
  
}
