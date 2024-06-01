package com.gamingsphere.Server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
   @GetMapping("/")
    public String home() {
        return "Connected to our Spring Boot Backend!!!";
    }

}
