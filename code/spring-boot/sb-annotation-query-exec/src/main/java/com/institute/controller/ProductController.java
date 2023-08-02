package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.ProductEntity;
import com.institute.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/create-product")
	public String saveProduct(@RequestBody ProductEntity prod) {
		repository.save(prod);
		return "Product Save Successfully";
	}
	
	@GetMapping("/get-all-product")
	public List<ProductEntity> getAllProduct() {
		return repository.findAll();
	}
	
}













