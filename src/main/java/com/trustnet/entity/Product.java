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
	private String productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "IMAGE_URL")
	private String imageUrl;
	
	@Column(name = "PRODUCT_DESC")
	private String productDesc;

	@Column(name = "SUB_CATEGORY_ID")
	private String subCategoryId;
	
	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	public Date modifiedDate;

	@Column(name = "PRODCUT_TITLE")
	private String prductTitle;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CITY_ID")
	private String cityId;
	
	@Column(name = "IS_TOP_PRODUCT")
	public String isTopProduct;
	
	@Column(name = "MIN_PRICE")
	public String minPrice;

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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
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

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getIsTopProduct() {
		return isTopProduct;
	}

	public void setIsTopProduct(String isTopProduct) {
		this.isTopProduct = isTopProduct;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", imageUrl=" + imageUrl
				+ ", productDesc=" + productDesc + ", subCategoryId=" + subCategoryId + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", prductTitle=" + prductTitle + ", description=" + description
				+ ", cityId=" + cityId + ", isTopProduct=" + isTopProduct + ", minPrice=" + minPrice + "]";
	}

}
