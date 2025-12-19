package com.example.demo.entity; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor



public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

     private Integer id;
     private String name;
     private String email;
     private String idnumber;
     }
