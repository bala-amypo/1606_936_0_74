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
            @Autowired StudentRepository student;
            //save()-----these are all inbuilt
            //findall()
            //findById()
            //deleteById()
            //existById()
@Override
    public StudentEntity postdata(StudentEntity stu){
         return student.save(stu);
         
    }
    @Override
   public  List<StudentEntity>getAllData(){
    return student.findAll();
   }
@Override
public String DeleteData(int id){
     student.deleteById(id);
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
