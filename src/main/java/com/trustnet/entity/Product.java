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

	@Column(name = "CATEGORY_ID", unique = false, nullable = false)
	private String categoryId;

	@Column(name = "CREATED_DATE")
	public Date createdDate;

	@Column(name = "BANNER_IMAGE_URL")
	private String bannerImageUrl;

	@Column(name = "PRODCUT_TITLE")
	private String prductTitle;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CITY")
	private String city;

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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
