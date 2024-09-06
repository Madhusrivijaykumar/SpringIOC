package com.example.SpringIOC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class ProductRepo {


    public interface ProductRepository<Product> extends JpaRepository<Product, Long> {
        List<Product> findByCategory(String category);
    }

}
