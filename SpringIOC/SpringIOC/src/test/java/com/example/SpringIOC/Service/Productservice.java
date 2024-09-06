package com.example.SpringIOC.Service;


import com.example.SpringIOC.Entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice {


        @Autowired
        private ProductRepository productRepository;

        public ProductEntity addProduct(ProductEntity product) {
            return productRepository.save(product);
        }

        public List<ProductEntity> getAllProducts() {
            return productRepository.findAll();
        }

        public List<ProductEntity> getProductsByCategory(String category) {
            return productRepository.findByCategory(category);
        }
    }

