package com.trustnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trustnet.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/home")
	public Object getMembers() {
		return productService.getLatestProduct(10L);
	}

	@GetMapping("/productDetail")
	public Object getProductDetail(@RequestParam("productId") Long id) {
		return productService.getProductDetail(id);
	}

}
