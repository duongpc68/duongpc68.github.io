package com.example.testingspringboot01.controller;


import com.example.testingspringboot01.model.response.ProductResponse;
import com.example.testingspringboot01.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@AllArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping("/admin")
    public String getProducts(Model model){
        List<ProductResponse> products = productService.getProducts();
        model.addAttribute("dsSanPham");
        return "product";
    }
}
