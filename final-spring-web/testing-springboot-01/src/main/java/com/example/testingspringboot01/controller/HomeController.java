package com.example.testingspringboot01.controller;


import com.example.testingspringboot01.model.response.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
