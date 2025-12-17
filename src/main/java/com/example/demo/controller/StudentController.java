package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public Class StudentController{
   @Autowired StudentService ser;
}
