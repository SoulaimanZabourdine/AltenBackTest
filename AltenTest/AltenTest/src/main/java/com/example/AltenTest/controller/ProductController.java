package com.example.AltenTest.controller;


import com.example.AltenTest.entity.Product;
import com.example.AltenTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping(value = "/products")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping(value = "/products/{productId}")
    public Product getProduct(@PathVariable(value="productId") Long id){
        return productService.getProduct(id);
    }

    @DeleteMapping(value = "/products/{productId}")
    public void deleteProduct(@PathVariable(value="productId") Long id){
        productService.deleteProduct(id);
    }

    @PatchMapping(value = "/products/{productId}")
    public Product modifyProduct(@PathVariable(value="productId") Long id, @RequestBody Product product){
        return productService.modifyProduct(id, product);
    }

}
