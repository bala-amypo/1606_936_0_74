package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;




@Service
public class StudentServiceImpl implements StudentService{
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
public  StudentEntity getData(int id){
    return student.findById(id);
}


}
