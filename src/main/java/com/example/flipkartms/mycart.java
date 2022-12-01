package com.example.flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycart {
    @GetMapping("/mycart")
    public String getData(){
        return "Please click here to check your cart details and proceed for checkout";
    }
}
