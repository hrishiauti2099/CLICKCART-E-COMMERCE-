package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";  // This should match your login.html file
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";  // This should match your signup.html file
    }
}