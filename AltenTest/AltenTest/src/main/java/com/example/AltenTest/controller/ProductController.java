package com.example.AltenTest.controller;


import com.example.AltenTest.entity.Product;
import com.example.AltenTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
