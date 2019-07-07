package com.trustnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_SELLER")
public class ProductSeller {
	@Id
	@Column(name = "PRODUCT_SELLER_ID", unique = true, nullable = false)
	private long productSellerId;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "MRP")
	private Double mrp;
	
	@Column(name = "COUNT")
	private Integer count;

	@Column(name = "PRODUCT_ID", nullable = false)
	private long productId;
	
	@Column(name = "SELLER_ID", nullable = false)
	private long sellerId;
	
	@Column(name = "CREATED_DATE")
	public Date createdDate;

	public long getProductId() {
		return productId;
	}

	public long getProductSellerId() {
		return productSellerId;
	}

	public void setProductSellerId(long productSellerId) {
		this.productSellerId = productSellerId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

}
