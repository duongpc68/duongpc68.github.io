package com.example.testingspringboot01.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        return "index";
    }
    @GetMapping("/contact")
    public String getContact(Model model){
        return "contact";
    }
    @GetMapping("/about")
    public String getAbout(Model model){
        return "about";
    }
}
