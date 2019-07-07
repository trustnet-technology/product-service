package com.trustnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trustnet.dto.Search;
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

	@GetMapping("/sellerDetail")
	public Object getSellerDetail(@RequestParam("sellerId") Long id) {
		return productService.getPSellerDetail(id);
	}

	@PostMapping("/search")
	public Object getSearchData(@RequestBody String data) {
		ObjectMapper om = new ObjectMapper();
		Object searchData = null;
		try {
			Search search = om.readValue(data, Search.class);
			searchData = productService.findDataWithFilter(search.getCategory(), search.getPriceRange(),
					search.getLocationRange());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return searchData;
	}

}
