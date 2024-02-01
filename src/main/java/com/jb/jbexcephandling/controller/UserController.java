package com.jb.jbexcephandling.controller;

import com.jb.jbexcephandling.Exception.NoUserFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{uid}")
    public String getUserById(@PathVariable("uid") Integer uid){

        if(uid<100){
            return "jb";

        }
        else
            throw new NoUserFoundException("Invalid user Id");
    }
}
