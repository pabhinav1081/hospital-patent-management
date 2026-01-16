package com.example.patenthospitalsystem.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class globalexceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException ex){
        Map<String,String > errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach((error)->{
            errors.put(error.getField(),error.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
    @ExceptionHandler(emailAlreadyExist.class)
    public ResponseEntity<String> handleEmailAlreadyExistException(emailAlreadyExist ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
