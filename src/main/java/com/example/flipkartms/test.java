package com.example.flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/test")
    public String getData(){
        return "This page is just to check the new microservice";
    }
}
