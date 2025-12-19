package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


import jakarta.validation.Valid;

import java.util.List;



@RestController
public class TimeStampController{
   @Autowired TimeStampService tim;
   @PostMapping("/post")
   public TimeStampEntity senddata(@RequestBody TimeStampEntity time){
          return tim.postdata(time);

   }
}