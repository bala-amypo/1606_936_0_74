package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;


import jakarta.validation.Valid;

import java.util.List;



@RestController
public class ValidationController{
   @Autowired ValidationService vs;
   @PostMapping("/post")
   public ValidationEntity senddata(@Valid @RequestBody ValidationEntity valid){
          return vs.postdata(valid);

   }
  
}
