package com.example.demo;

import com.example.demo.model.Ingredient;
import com.example.demo.model.IngredientRepository;
import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "*")
public class ReceiptController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private IngredientRepository ingredientRepository;

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@PostMapping("/product")
	public Product  createProduct(@Valid @RequestBody Product product) {
		return productRepository.save(product);
	}

	@PostMapping("/ingredient")
	public Ingredient createProduct(@Valid @RequestBody Ingredient ingredient) {
		System.out.println(ingredient);
		return ingredientRepository.save(ingredient);
//		return ingredient;
	}


}
