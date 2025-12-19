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
    protected void Oncreate(){
    LocalDateTime now=LocalDatetime().now();
    this.creatdat=now;
    this.updatedat=now;
 }
 @PreUpdate
 protected void Offcreate(){
        LocalDateTime now=LocalDatetime().now();

    this.updatedat=now;
 }
}
