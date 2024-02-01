package com.jb.jbexcephandling.Exception;

public class NoUserFoundException extends RuntimeException{
    public NoUserFoundException(String s) {
        super(s);
    }
}
