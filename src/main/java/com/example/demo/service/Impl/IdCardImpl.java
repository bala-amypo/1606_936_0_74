package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.IdCardService;
import com.example.demo.repository.IdCardRepository;
import com.example.demo.entity.IdCard;

@Service
public class IdCardImpl implements IdCardService {

    @Autowired
    IdCardRepository idr;

    @Override
    public IdCard postdataa(IdCard idc) {
        return idr.save(idc);
    }
}
