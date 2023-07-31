package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.institute.entity.Product;
import com.institute.service.ProductService;

@SpringBootApplication
public class SbJpaIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbJpaIntroApplication.class, args);
		ProductService service = ctx.getBean(ProductService.class);
		
		Product p = new Product();
		p.setId(121);
		p.setName("Smart TV");
		p.setPrice(23423.32);
		p.setQuantity(1);
		
		service.saveProduct(p);
	}

}
