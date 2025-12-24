package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.IdCardService; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.IdCard;


import jakarta.validation.Valid;

import java.util.List;



@RestController
@RequestMapping("/student")

public class IdCardControl{
   @Autowired IdCardService serv;
   @PostMapping("/postid")
   public IdCard senddata(@RequestBody IdCard idc){
          return serv.postdataa(idc);

   }
  
}
