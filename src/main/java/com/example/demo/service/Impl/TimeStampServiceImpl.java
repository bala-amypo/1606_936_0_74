package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStampEntity;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired TimeStampRepository repoo;

    @Override
    public TimeStampEntity postData(TimeStampEntity time) {
        return repoo.save(time);
    }
}
