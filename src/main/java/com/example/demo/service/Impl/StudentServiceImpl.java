package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;



@Service
public class StudentServiceImpl implements StudentService{
            @Autowired StudentRepository student;
            //save()
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
public String DeleteData(Integer id);
     student.deleteById(id);
     return "Deleted Successfully";

}
