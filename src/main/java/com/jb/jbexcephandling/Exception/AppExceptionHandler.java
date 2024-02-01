package com.jb.jbexcephandling.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = NoUserFoundException.class)
    public ResponseEntity<AppExInfo> handleUserExceptionHandler(Exception e){
        AppExInfo exInfo = new AppExInfo();
        exInfo.setExCode("EX001");
        exInfo.setExMsg(e.getMessage());
        exInfo.setExDate(LocalDateTime.now());
        return new ResponseEntity<AppExInfo>(exInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<AppExInfo> handleAppExceptionHandler(Exception e){
        AppExInfo exInfo = new AppExInfo();
        exInfo.setExCode("EX002");
        exInfo.setExMsg(e.getMessage());
        exInfo.setExDate(LocalDateTime.now());
        return new ResponseEntity<AppExInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
