package com.example.flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class diwalioffers {
    @GetMapping("/diwalioffers")
    public String getData(){
        return "We have Big bellion day for you, Enjoy your shopping";
    }
}
