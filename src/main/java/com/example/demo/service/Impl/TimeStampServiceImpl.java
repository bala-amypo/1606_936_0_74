package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStampEntity;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired
    private TimeStampRepository repo;

    @Override
    public TimeStampEntity postData(TimeStampEntity time) {
        return repo.save(time);
    }
}
