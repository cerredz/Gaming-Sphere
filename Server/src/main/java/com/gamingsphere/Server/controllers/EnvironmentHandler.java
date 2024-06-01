package com.gamingsphere.Server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentHandler {
    
    @Autowired
    private Environment environment;

    @GetMapping("/msg")
    public String displayMessage() {
        // just testing how to get the envionment variables values
        String message1 = environment.getProperty("spring.datasource.mongodb") + " this is key 1";
        return message1;
    }

}
