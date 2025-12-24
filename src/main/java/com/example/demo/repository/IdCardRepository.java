package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.IdCard;

import org.springframework.stereotype.Repository;
@Repository 
public interface IdCardRepository extends JpaRepository<IdCard,Integer>{
            
}                              