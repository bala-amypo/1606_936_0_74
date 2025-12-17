package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{
            @Autowired StudentRepository student;
            //save()
            //findall()
            //findById()
            //deleteById()
            //existById()

    public StudentEntity postdata(StudentEntity stu){
         return student.save(stu);
         
    }

}
