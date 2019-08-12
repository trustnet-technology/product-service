package com.trustnet.dto;

import java.util.Date;

public class Product {
	private String productId;
	private String productName;
	private String categoryId;
	private Date createdDate;
	private String prductTitle;
	private String description;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPrductTitle() {
		return prductTitle;
	}

	public void setPrductTitle(String prductTitle) {
		this.prductTitle = prductTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
