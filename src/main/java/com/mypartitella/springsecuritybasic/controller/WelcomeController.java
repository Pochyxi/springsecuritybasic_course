package com.mypartitella.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Security implemented asd";
    }

}
