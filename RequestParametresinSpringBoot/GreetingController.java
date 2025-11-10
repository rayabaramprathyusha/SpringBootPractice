package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{

    //using path variable
    @GetMapping("/greet/{name}")
    public String greetUserPath(@PathVariable String name){
        return "Hello "+name +" Via Pathvariable";
    }

    //using request parameter
    @GetMapping("/greet")
    public String greetUserParam(@RequestParam String name){
        return "Hello "+name +" Via Param";
    }

}

