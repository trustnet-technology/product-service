
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
	private String productSellerId;
	
	@Column(name = "COUNT")
	private Integer count;

	@Column(name = "PRODUCT_ATTRIBUTE_ID")
	private String productAttributeId;
	
	@Column(name = "SELLER_ID", unique = false,nullable = false)
	private String sellerId;
	
	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	public Date modifiedDate;
	
	@Column(name = "IMAGES")
	private String images;
	
	@Column(name = "LAT")
	private String lat;
	
	@Column(name = "LON")
	private String lon;
	
	@Column(name = "AVG_RATING")
	private String avgRating;
	
	@Column(name = "SELLER_NAME")
	private String sellerName;
	
	@Column(name = "SELLER_ADDRESS")
	private String sellerAddress;

	/**
	 * @return the productSellerId
	 */
	public String getProductSellerId() {
		return productSellerId;
	}

	/**
	 * @param productSellerId the productSellerId to set
	 */
	public void setProductSellerId(String productSellerId) {
		this.productSellerId = productSellerId;
	}

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

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
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the images
	 */
	public String getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(String images) {
		this.images = images;
	}

	/**
	 * @return the lat
	 */
	public String getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * @return the lon
	 */
	public String getLon() {
		return lon;
	}

	/**
	 * @param lon the lon to set
	 */
	public void setLon(String lon) {
		this.lon = lon;
	}

	/**
	 * @return the avgRating
	 */
	public String getAvgRating() {
		return avgRating;
	}

	/**
	 * @param avgRating the avgRating to set
	 */
	public void setAvgRating(String avgRating) {
		this.avgRating = avgRating;
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @return the sellerAddress
	 */
	public String getSellerAddress() {
		return sellerAddress;
	}

	/**
	 * @param sellerAddress the sellerAddress to set
	 */
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	@Override
	public String toString() {
		return "ProductSeller [productSellerId=" + productSellerId + ", count=" + count + ", productAttributeId="
				+ productAttributeId + ", sellerId=" + sellerId + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + ", images=" + images + ", lat=" + lat + ", lon=" + lon + ", avgRating=" + avgRating
				+ ", sellerName=" + sellerName + ", sellerAddress=" + sellerAddress + "]";
	}

	
}
