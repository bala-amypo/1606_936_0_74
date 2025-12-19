package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.exception.TimeStampException;

import java.util.List;
//import org.springframework.web.bind.annotation.PathVariable;




@Service
public class TimeStampImpl implements TimeStampService{
            @Autowired ValidationRepository timestamp;
            //save()-----these are all inbuilt
            //findall()
            //findById()
            //deleteById()
            //existById()
@Override
    public TimeStampEntity postdata(TimeStampEntity time ){
         return time.save(time);
         
    }
}