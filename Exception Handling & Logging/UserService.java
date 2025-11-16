package com.example.hellospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger logger= LoggerFactory.getLogger(UserService.class);
    public String createGreeting(String name) {
       logger.info("Recieved request for name"+name);
       if (name==null||name.trim().isEmpty()){
           logger.error("invalid name input");
           throw new InvalidNameException("name cannot be  Empty");
       }
       return "Hello "+name +" Welcome to Spring boot";
    }
}
