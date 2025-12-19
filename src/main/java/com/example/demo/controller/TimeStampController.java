package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;

@RestController
public class TimeStampController {

    @Autowired
    private TimeStampService tim;

    @PostMapping("/time")
    public TimeStampEntity senddata(@RequestBody TimeStampEntity tim) {
        return tim.postdata(tim);
    }
}
