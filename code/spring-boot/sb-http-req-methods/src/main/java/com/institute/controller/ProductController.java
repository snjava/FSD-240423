package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.dto.Product;
import com.institute.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/create-product")
	public String createProduct(@RequestBody Product prod) {
		service.saveProduct(prod);
		return "Product Created Successfully";
	}
	@GetMapping("/get-products")
	public List<Product> getProduct() {
		return service.getProduct();
	}
	@PutMapping("/update-product")
	public String updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
		return "Product Updated Successfully";
	}
	@DeleteMapping("/delete-product/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.deleteProduct(id);
		return "Product Deleted Successfully..";
	}
}







