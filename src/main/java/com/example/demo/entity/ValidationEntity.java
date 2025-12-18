package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;




@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
   



    private Long id;
     @NotNull
    @size(min=2,max=6,message="must be 2 to 6 char only")
    private String username;
    @Email(message="Email is not valid")
    private String email;
     @Max=6
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @
    private int age;

    
}