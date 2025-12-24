package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentsStructure;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;




import org.springframework.stereotype.Repository;
@Repository 
public interface StudentRepo extends JpaRepository<StudentsStructure,Integer>{
    @Query("SELECT s FROM StudentsStructure s WHERE s.stuEmail=:email")
    List<StudentsStructure>findByEmail(@Param ("email") String email);   
    @Query("SELECT s FROM StudentsStructure s WHERE s.cGpaMark") 
}                              