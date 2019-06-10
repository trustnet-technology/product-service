package com.trustnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	private long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "IMAGE_URL")
	private String imageUrl;
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	private long categoryId;
	@Column(name = "CREATED_DATE")
	public Date createdDate;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	

}
