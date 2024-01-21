package com.jb.jbexcephandling.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        int i = 10/0;
        return "Welcome to JB IT";
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<String> handleAE(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
