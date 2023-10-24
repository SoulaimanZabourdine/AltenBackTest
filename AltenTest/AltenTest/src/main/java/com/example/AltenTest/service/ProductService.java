package com.example.AltenTest.service;

import com.example.AltenTest.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product modifyProduct(Long id, Product product) {
        Optional<Product> productToModify = productRepository.findById(id);
        if(productToModify.isEmpty()){
            return null;
        }
        product.setId(productToModify.get().getId());
        return productRepository.save(product);
    }
}
