package com.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.entity.Product;
import com.institute.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	public void saveProduct(Product product) {
		repository.save(product);
	}
}
