package com.example.demo.entity; 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.sql.Date;
@Entity
public class StudentEntity{
    @Id
     Private Integer id;
     Private String username;
     Private String email;
     Private String password;
     private Date created;

public Integer getId(){
    return id;
}
public void setId(Integer id ){
    this.id=id;
}
 
 Public String getUsername(){
   return username;
 }
 Public void setUsername(String usernamename){
    this.username=username;
 }
 Public String getEmail(){
    return email;
 }
 Public void setEmail(String email){
    this.email=email;
 }
 public String getPassword(){
    return password;
 }
 public void setPassword(String password){
    this.password=password;
 }

 public Date getCreated(){
    return date;
 }
 public void setCreated(Date created){
    this.created=created;
 }
 Public StudentEntity(Integer id,String username,string email,String password,Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.created=created;

 }
 public SampleEntity(){

 }


}