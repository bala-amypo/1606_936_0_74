package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;


@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

     @NotNull
    @Size(min=2,max=6,message="must be 2 to 6 char only")
    private String username;

    @Email(message="Email is not valid")
    private String email;

     @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    private String password;

    @Max(30)
    @Positive(message="Age must be positive")
    private int age;

    




}





























// //GETTER SETTER
//     public Long getId(){
//     return id;
// }
// public void setId(Long id ){
//     this.id=id;
// }
 
//  public String getUsername(){
//    return username;
//  }
//  public void setUsername(String username){
//     this.username=username;
//  }
//  public String getEmail(){
//     return email;
//  }
//  public void setEmail(String email){
//     this.email=email;
//  }
//  public String getPassword(){
//     return password;
//  }
//  public void setPassword(String password){
//     this.password=password;
//  }

//  public int getAge(){
//     return age;
//  }
//  public void setAge(int age){
//     this.age=age;
//  }
// //PARA_CONS
// public ValidationEntity(Long Id,
//      @NotNull @Size(min=2,max=6,message="must be 2 to 6 char only") String username,
//     @Email(message="Email is not valid") String email,
//     @Size(min=2,max=6) @NotNull(message="Password is mandatory") String password,
//      @Max(30) @Positive(message="Age must be positive")  int age
//      ){

//      this.id=id;
//      this.username=username;
//      this.email=email;
//      this.password=password;
//      this.age=age;
// }
// public ValidationEntity(){

// }

    
}