package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.vaklidation.Valid;

import java.util.List;



@RestController
public class StudentController{
   @Autowired StudentService ser;
   @PostMapping("/post")
   public StudentEntity senddata(@RequestBody StudentEntity stu){
          return ser.postdata(stu);

   }
   @GetMapping("/get")
   public List<StudentEntity>getval(){
      return ser.getAllData();
   }

   @DeleteMapping("/delete/{id}")
public String  deleteval(@PathVariable int id){
   return service.DeleteData(id);
}
}
