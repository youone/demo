package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;
import com.example.demo.model.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class ProductTest {

    @Autowired
//    private ProductService productService;
    private ProductRepository productService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        Product product = new Product("egg", "st");
        productService.save(product);
    }
}