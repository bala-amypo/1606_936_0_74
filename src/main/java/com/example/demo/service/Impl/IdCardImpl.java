package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.IDCardService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.IDCardRepository;
import com.example.demo.entity.IdCard;
import java.util.List;
//import org.springframework.web.bind.annotation.PathVariable;
@Service
public class IdCardImpl implements IdCardService{
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
