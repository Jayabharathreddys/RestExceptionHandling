package com.jb.jbexcephandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMsgRestController {

    @GetMapping("/demo")
    public String getWelcomeMsg(){
        String s = null;
        int i = s.length();
        return "Welcome to JB IT";
    }

}
