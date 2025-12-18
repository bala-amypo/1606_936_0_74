package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentEntity;

import org.springframework.stereotype.Repository;
@Repository 
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
            
}                              