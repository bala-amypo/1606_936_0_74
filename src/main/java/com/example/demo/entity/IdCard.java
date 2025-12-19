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
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor



public class IdCard  {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

     private Integer id;
     private String studentcard;
     private String cardnumber;

     @OneToOne
     @JoinColumn(name="student_id")
     private studentdetails student;

}
