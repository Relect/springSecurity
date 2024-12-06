package com.example.spring_Security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
