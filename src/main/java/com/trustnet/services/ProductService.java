package com.trustnet.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trustnet.dto.Product;
import com.trustnet.dto.ProductHome;
import com.trustnet.repo.TrustnetRepository;

@Component
public class ProductService {

	@Autowired
	TrustnetRepository tnRepository;

	public ProductHome getLatestProduct(Long customerId) {
		
		List<Long> categories=(List<Long>)tnRepository.findRecord("select category_id from category");
		List<Object[]>  products=null; 
		ProductHome home=new ProductHome();
		for (Long id : categories) {
			
		
		products = (List<Object[]> ) tnRepository
				.findRecord("select a.product_id,a.product_name,a.image_url,b.product_desc,c.price," + 
						"  c.mrp from" + 
						"  product a" + 
						"  join  product_detail b on a.product_id = b.product_id" + 
						"  join  product_seller c on a.product_id=c.product_id where a.category_id="+id);
		
		List<Product> pList= new ArrayList<>();
		products.stream().forEach((record) -> {
	        Long pid = ((BigInteger) record[0]).longValue();
	        String title = (String) record[1];
	        String url = (String) record[2];
	        String desc = (String) record[3];
	        String price = (String) record[3];
	        String mrp = (String) record[3];
	        Product p = new Product();
	        p.setDescription(desc);
	        p.setImageUrl(url);
	        p.setMrp(mrp);
	        p.setName(title);
	        p.setPrice(price);
	        p.setProductId(pid.toString());
	        pList.add(p);
	});
		if(id==1)
	        home.setApparel(pList);
	        if(id==2)
		        home.setDecor(pList);
	        if(id==3)
		        home.setGrocery(pList);
	        if(id==4)
		        home.setHome_appliances(pList);

	}
		return home;
	}

	public Object saveProduct(Object entity) {
		tnRepository.save(entity);
		return entity;
	}

}
