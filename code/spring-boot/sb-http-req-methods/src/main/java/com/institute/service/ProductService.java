package com.institute.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.institute.dto.Product;

@Service
public class ProductService {
	private List<Product> prodList = new ArrayList<Product>();
	
	public void saveProduct(Product prod) {
		prodList.add(prod);
	}
	
	public List<Product> getProduct() {
		return prodList;
	}
	
	public void updateProduct(Product prod) {
		Product oldProd = getProductById(prod.getId());
		oldProd.setName(prod.getName());
		oldProd.setPrice(prod.getPrice());
		oldProd.setQuantity(prod.getQuantity());
	}
	
	
	public void deleteProduct(int id) {
		Product prod = getProductById(id);
		prodList.remove(prod);
	}
	
	
	public Product getProductById(int id) {
		Product prod = null;
		for(Product p : prodList) {
			if(id == p.getId()) {
				prod = p;
			}
		}
		return prod;
	}
	
	
	
}













