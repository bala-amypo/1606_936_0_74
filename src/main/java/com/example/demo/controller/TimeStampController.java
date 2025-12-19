package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.TimeStampEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;




import jakarta.validation.Valid;

import java.util.List;



@RestController
public class ValidationController{
   @Autowired ValidationService vs;
   @PostMapping("/data")
   public ValidationEntity senddata(@Valid @RequestBody ValidationEntity valid){
          return vs.postdata(valid);

   }
   }