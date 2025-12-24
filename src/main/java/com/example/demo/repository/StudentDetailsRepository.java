package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentStudentEntity;

import org.springframework.stereotype.Repository;
@Repository 
public interface StudentDetailsRepository extends JpaRepository<StudentDetailsEntity,Integer>{
            
}                              