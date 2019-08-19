package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUB_CATEGORY")
public class SubCategory {
	
	@Id
	@Column(name = "SUB_CATEGORY_ID", unique = true, nullable = false)
	private String subategoryId;
	
	@Column(name = "CATEGORY_ID")
	private String categoryId;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	
	@Column(name = "SIZE")
	private String size;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "WEIGHT")
	private String weight;
	
	@Column(name = "MIN_PRICE")
	private String minPrice;
	
	@Column(name = "IMAGE_URL")
	private String imageURL;

	/**
	 * @return the subategoryId
	 */
	public String getSubategoryId() {
		return subategoryId;
	}

	/**
	 * @param subategoryId the subategoryId to set
	 */
	public void setSubategoryId(String subategoryId) {
		this.subategoryId = subategoryId;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	 * @return the minPrice
	 */
	public String getMinPrice() {
		return minPrice;
	}

	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "SubCategory [subategoryId=" + subategoryId + ", categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", size=" + size + ", color=" + color + ", weight=" + weight + ", minPrice=" + minPrice
				+ ", imageURL=" + imageURL + "]";
	}
	
}
