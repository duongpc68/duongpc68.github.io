package com.example.testingspringboot01.exception;

import com.example.testingspringboot01.entity.Product;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
