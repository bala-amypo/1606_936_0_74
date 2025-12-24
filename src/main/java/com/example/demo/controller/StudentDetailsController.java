package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentDetailsService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentDetailsEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


import jakarta.validation.Valid;

import java.util.List;




@RestController
public class StudentDetailsController {
    @Autowired
    StudentDetailsService serr;

    @PostMapping("/poststud")
    public StudentDetailsEntity senddata(@RequestBody StudentDetailsEntity studet) {
        return serr.postdata(studet);
    }
}

