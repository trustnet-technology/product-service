package com.trustnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_ATTRIBUTE")
public class ProductAttribute {

	@Id
	@Column(name = "PRODUCT_ATTRIBUTE_ID", unique = true, nullable = false)
	private String productAttributeId;

	@Column(name = "MRP")
	private String mrp;

	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@Column(name = "SUB_CATEGORY_ID")
	private String subCategoryId;

	@Column(name = "SP")
	private String sp;

	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	public Date modifiedDate;

	@Column(name = "SIZE")
	public String size;

	@Column(name = "COLOR")
	public String color;

	@Column(name = "weight")
	public String weight;
	
	@Column(name = "IMAGE_URL")
	public String imageUrl;

	/**
	 * @return the productAttributeId
	 */
	public String getProductAttributeId() {
		return productAttributeId;
	}

	/**
	 * @param productAttributeId the productAttributeId to set
	 */
	public void setProductAttributeId(String productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	/**
	 * @return the mrp
	 */
	public String getMrp() {
		return mrp;
	}

	/**
	 * @param mrp the mrp to set
	 */
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the sp
	 */
	public String getSp() {
		return sp;
	}

	/**
	 * @param sp the sp to set
	 */
	public void setSp(String sp) {
		this.sp = sp;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Override
	public String toString() {
		return "PrductAttribute [productAttributeId=" + productAttributeId + ", mrp=" + mrp + ", productId=" + productId
				+ ", sp=" + sp + ", createdDate=" + createdDate + ", size=" + size + ", color=" + color + ", weight="
				+ weight + ", imageUrl=" + imageUrl + "]";
	}

	
}
