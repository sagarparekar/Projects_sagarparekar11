package com.learn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateProjectNameException extends Exception{

    public DuplicateProjectNameException(String msg){
        super(msg);
    }
}
