package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import java.util.List;
//import org.springframework.web.bind.annotation.PathVariable;




@Service
public class ValidationImpl implements ValidationService{
            @Autowired ValidationRepository validation;
            //save()-----these are all inbuilt
            //findall()
            //findById()
            //deleteById()
            //existById()
@Override
    public ValidationEntity postdata(ValidationEntity valid ){
         return validation.save(valid);
         
    }
    @Override
   public  List<ValidationEntity>getAllData(){
    return validation.findAll();
   }
@Override
public String DeleteData(long id){
     validation.deleteById(id);
     return "Deleted Successfully";
}
@Override
public  StudentEntity getData(int id){
    return student.findById(id).orElse(null);
}
@Override
 public StudentEntity updateData(int id,StudentEntity entity){
       if(student.existsById(id)){
          entity.setId(id);
          return student.save(entity);
       }
       return null;
 }



}
