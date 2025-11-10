package com.example.hellospring;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String createGreeting(String name) {
       return "Hello " + name +" from Service";
    }
}

