package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ValidationEntity;

import org.springframework.stereotype.Repository;
@Repository 
public interface ValidationRepository extends JpaRepository<ValidationEntity,Long>{
            
}                              