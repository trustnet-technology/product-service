package com.trustnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trustnet.entity.Product;
import com.trustnet.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public List<Product> getMembers() {
	    return productService.getLatestProduct(10L);
	}
	

}
