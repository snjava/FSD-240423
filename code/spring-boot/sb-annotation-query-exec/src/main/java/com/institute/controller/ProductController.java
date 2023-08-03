package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/get-all-available-product")
	public List<ProductEntity> getProductByStatus() {
		//return repository.getProductByAvability_HQL();
		return repository.getProductByAvability_SQL();
	}
	
	@GetMapping("/get-product-by-price/{min}/{max}")
	public List<ProductEntity> getByPrice(@PathVariable("min") double min,@PathVariable("max") double max) {
		return repository.getProductByPrice(min, max);
	}
	
	@PutMapping("/update-product-price")
	public String updatePrice(@RequestParam(name = "percent") double percent) {
		repository.updateProductPrice(percent/100);
		return "Product Price updated by percent : "+ percent;
	}
}













