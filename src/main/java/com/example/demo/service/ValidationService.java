package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;
import java.util.List;


public interface ValidationService{

  ValidationEntity postdata(ValidationEntity valid);
 // ValidationEntity updateData(long id,ValidationEntity entity);
  ValidationEntity getDataa(long id);

  

}