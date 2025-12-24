package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentsStructure;
import org.springframework.data.jpa.repository.Query;


import org.springframework.stereotype.Repository;
@Repository 
public interface StudentRepo extends JpaRepository<StudentsStructure,Integer>{
    @Query("SELECT * FROM StudentsStructure s WHERE s.stuEmail=:email")
    List<StudentsStructure>findEmail    
}                              