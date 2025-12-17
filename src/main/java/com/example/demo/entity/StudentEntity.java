package com.example.demo.entity; 
import java.sql.Date;
@Entity
public class StudentEntity{
     Private Integer id;
     Private String username;
     Private String email;
     Private String password;

public int getid()
 
 Public String getusername(){
   return username;
 }
 Public void setusername(String newname){
    this.username=newname;
 }
 Public String email(){
    return email;
 }
 Public void setemail(String newmail){
    this.email=newmail
 }


}