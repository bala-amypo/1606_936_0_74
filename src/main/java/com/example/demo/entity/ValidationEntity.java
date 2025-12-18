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
    @NotNull
    @size(min=2,max=10);
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;

    @NotNull
}