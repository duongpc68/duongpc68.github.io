package com.example.testingspringboot01.service;


import com.example.testingspringboot01.entity.Product;
import com.example.testingspringboot01.model.request.ProductCreationRequest;
import com.example.testingspringboot01.model.response.ProductResponse;
import com.example.testingspringboot01.repository.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
private final ProductJpaRepository productJpaRepository;
    public List<ProductResponse> getProducts() {


        List<Product> products = productJpaRepository.findAll();
        return products.stream()
                .map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .productName(product.getProductName())
                        .price(product.getPrice())
                        .description(product.getDescription())
                        .build()
                )
                .collect(Collectors.toList());
    }
    public void createProduct(ProductCreationRequest request) {
        Product student = Product.builder()
                .productName(request.getProductName())
                .price(request.getPrice())
                .description(request.getDescription())
//                .image(request.getImage())
                .build();
//        studentRepository.save(student);
        productJpaRepository.save(student);
    }

}
