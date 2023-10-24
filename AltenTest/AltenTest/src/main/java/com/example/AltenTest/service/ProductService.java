package com.example.AltenTest.service;

import com.example.AltenTest.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(Long.parseLong("1"));
        product.setName("TstName");
        product.setDescription("testdesc");
        product.setCode("testcode");
        products.add(product);
        return products;
    }

}
