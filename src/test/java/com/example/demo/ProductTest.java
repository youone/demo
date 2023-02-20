package com.example.demo;

import com.example.demo.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class ProductTest {

    @Autowired
//    private ProductService productService;
    private ProductRepository productService;
    @Autowired
    private IngredientRepository ingredientService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        Product product1 = new Product("egg", "st");
        Product product2 = new Product("milk", "dl");
        productService.save(product1);
        productService.save(product2);
        Ingredient eggs = new Ingredient(product1,2.0,"st");
        Ingredient milk = new Ingredient(product2,5.0,"dl");
        ingredientService.save(milk);
        ingredientService.save(eggs);

    }
}