package com.example.finalproject.controller.anonymous;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/login")
    public String getLoginPage() {
        return "sign-in";
    }

    @GetMapping("/signup")
    public String getSignUp() {
        return "sign-up";
    }

}
