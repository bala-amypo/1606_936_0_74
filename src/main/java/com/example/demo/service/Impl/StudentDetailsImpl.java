package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.entity.StudentdetailsEntity;
import java.util.List;
//import org.springframework.web.bind.annotation.PathVariable;
@Service
public class StudentD implements IdCardService{
            @Autowired IdCardRepository idr;
            //save()-----these are all inbuilt
            //findall()
            //findById()
            //deleteById()
            //existById()
@Override
    public IdCard postdata(IdCard idc){
         return idr.save(idc);
         
    }
   


}
