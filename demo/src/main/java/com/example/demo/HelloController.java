package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Ganesh + Shubham + Avadhut= Angar Aag";
    }

    @GetMapping("/perform")
    public String perform(){
        return "perform operation feeling good";
    }
}
