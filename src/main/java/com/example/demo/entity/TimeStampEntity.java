package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void Oncreate(){
    LocalDateTime now=LocalDateTime.now();
    if(this.createdAt==null){
    this.createdAt=now;
    }
    this.updatedAt=now;
 }
 @PreUpdate
 public void Onupdate(){
        LocalDateTime now=LocalDateTime.now();

    this.updatedAt=now;
 }
}
