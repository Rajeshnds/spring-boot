package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    public String doGet(){
        return "Hello G, I am your get mapping";
    }

    @PostMapping("/post")
    public String doPost(){
        return "Hello G, I am your get mapping";
    }

}
