package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimeStampEntity;

import org.springframework.stereotype.Repository;
@Repository 
public interface TimeStampRepository extends JpaRepository<TimeStampEntity,Long>{
            
}                              