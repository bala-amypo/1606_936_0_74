package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimeStampEntity;

public interface TimeStampRepository
        extends JpaRepository<TimeStampEntity, Long> {
}
