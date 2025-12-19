package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.demo.exception.ValidationException;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalException{
     @ExceptionHandler(ValidationException.class)

     public ResponseBody<String> handleValidationExeception(ValidationException ex){
               return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
     }

}