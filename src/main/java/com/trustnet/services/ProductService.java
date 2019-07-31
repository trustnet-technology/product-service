package com.trustnet.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.trustnet.dto.Prodetail;
import com.trustnet.dto.Product;
import com.trustnet.dto.ProductHome;
import com.trustnet.dto.Seller;
import com.trustnet.dto.ShopDetail;
import com.trustnet.entity.SellerDetail;
import com.trustnet.repo.TrustnetRepository;

@Component
public class ProductService {

	@Autowired
	TrustnetRepository tnRepository;

	@SuppressWarnings("unchecked")
	public ProductHome getLatestProduct(Long customerId) {

		List<String> categories = (List<String>) tnRepository.findRecord("select category_id from category");
		List<Object[]> products = null;
		ProductHome home = new ProductHome();
		for (String id : categories) {

			products = (List<Object[]>) tnRepository
					.findRecord("select a.product_id,a.product_name,a.image_url,b.product_desc,c.price,"
							+ "  c.mrp from" + "  product a" + "  join  product_detail b on a.product_id = b.product_id"
							+ "  join  product_seller c on a.product_id=c.product_id where a.category_id=" + id);

			List<Product> pList = new ArrayList<>();
			products.stream().forEach((record) -> {
				Long pid = ((BigInteger) record[0]).longValue();
				String title = (String) record[1];
				String url = (String) record[2];
				String desc = (String) record[3];
				String price = (String) record[4];
				String mrp = (String) record[5];
				Product p = new Product();
				p.setDescription(desc);
				p.setImageUrl(url);
				p.setMrp(mrp);
				p.setName(title);
				p.setPrice(price);
				p.setProductId(pid.toString());
				pList.add(p);
			});
			if (id.equals("1"))
				home.setApparel(pList);
			if (id.equals("2"))
				home.setDecor(pList);
			if (id.equals("3"))
				home.setGrocery(pList);
			if (id.equals("4"))
				home.setHome_appliances(pList);

		}
		return home;
	}

	@SuppressWarnings("unchecked")
	public Prodetail getProductDetail(Long productId) {

		List<Object[]> products = null;
		List<Object[]> seller = null;
		Prodetail prodetail = new Prodetail();
		List<Seller> sList = new ArrayList<>();
		products = (List<Object[]>) tnRepository
				.findRecord("select a.product_name,a.image_url,a.category_id,b.product_desc,c.price," + "c.mrp from "
						+ "product a " + "join  product_detail b on a.product_id = b.product_id "
						+ "join  product_seller c on a.product_id=c.product_id where a.product_id=" + productId);

		seller = (List<Object[]>) tnRepository
				.findRecord("select a.price,a.mrp,a.seller_id,b.address,b.seller_name " + "from" + " product_seller a "
						+ "join  seller_detail b on a.seller_id = b.seller_id " + "where a.product_id=" + productId);

		seller.stream().forEach((record) -> {
			String price = ((String) record[0]);
			String mrp = (String) record[1];
			Long sellerId = ((BigInteger) record[2]).longValue();
			String address = (String) record[3];
			String sname = (String) record[4];
			Seller sel = new Seller();
			sel.setLocation(address);
			sel.setMrp(mrp);
			sel.setName(sname);
			sel.setPrice(price);
			sel.setSellerId(sellerId);
			sList.add(sel);
		});

		products.stream().forEach((record) -> {
			String pname = ((String) record[0]);
			String url = (String) record[1];
			String cname = (String) record[2];
			String desc = (String) record[3];
			String price = (String) record[4];
			String mrp = (String) record[5];
			prodetail.setCategory(cname);
			prodetail.setDetails(desc);
			prodetail.setImageUrls(Arrays.asList(url.split(",")));
			prodetail.setMrp(mrp);
			prodetail.setName(pname);
			prodetail.setPrice(price);

		});

		prodetail.setSellers(sList);
		return prodetail;
	}

	@SuppressWarnings("unchecked")
	public ShopDetail getPSellerDetail(Long sellerId) {

		List<Object[]> reviews = null;
		ShopDetail shopdetail = new ShopDetail();
		SellerDetail sd = (SellerDetail) tnRepository.findById(sellerId, SellerDetail.class);

		reviews = (List<Object[]>) tnRepository
				.findRecord("select a.comment,a.rating " + "from review a " + "where a.seller_id=" + sellerId);
		if (sd != null) {
			shopdetail.setContact(sd.getContactNumber());
			shopdetail.setLocation(sd.getAddress());
			shopdetail.setName(sd.getSellerName());
			shopdetail.setShopId(sd.getSellerId());
			shopdetail.setTopsReviews(reviews);
		}
		return shopdetail;
	}

	public Object saveProduct(Object entity) {
		tnRepository.save(entity);
		return entity;
	}

	@SuppressWarnings("unchecked")
	public Object findDataWithFilter(String category, String priceRange, String locationRange) {
		List<Object[]> reviews = null;
		String query = "select a.product_id,a.product_name,a.image_url,b.product_desc,c.price," + "c.mrp from "
				+ "product a " + "join  product_detail b on a.product_id = b.product_id "
				+ "join  product_seller c on a.product_id=c.product_id where ";
		if (!StringUtils.isEmpty(category))
			query=query.concat("a.category_id=" + category);
		if (!StringUtils.isEmpty(priceRange)) {
			String[] price = priceRange.split(",");
			query=query.concat(" and c.price between " + price[0] + " and " + price[1]);
		}
		reviews = (List<Object[]>) tnRepository
				.findRecord(query);

		return reviews;
	}

	public Object getRecentSeller() {
		List<SellerDetail> recentSellers = (List<SellerDetail>)tnRepository.findRecords("select * from nearbymaster.seller_detail sd order by modified_date desc limit 3", SellerDetail.class);
		return recentSellers;
	}

}
