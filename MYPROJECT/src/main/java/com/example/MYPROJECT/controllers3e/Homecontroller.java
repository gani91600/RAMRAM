package com.example.MYPROJECT.controllers3e;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
}



