package com.trustnet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trustnet.entity.Product;
import com.trustnet.repo.TrustnetRepository;

@Component
public class ProductService {

	@Autowired
	TrustnetRepository tnRepository;

	public List<Product> getLatestProduct(Long customerId) {
		List<Product> products = (List<Product>) tnRepository
				.findRecord("Select * from Product ORDER BY createdDate DESC limit 10");
		return products;

	}

	public Object saveProduct(Object entity) {
		tnRepository.save(entity);
		return entity;
	}

}
