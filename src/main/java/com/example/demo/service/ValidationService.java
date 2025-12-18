package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;
import java.util.List;


public interface ValidationService{

  ValidationEntity postdata(ValidationEntity valid);
 
  List<ValidationEntity>getAllData();

  String DeleteData(long id);
  StudentEntity getData(long id);
  StudentEntity updateData(long id,ValidationEntity entity);
  

}