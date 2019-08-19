package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER_LATEST_OFFER")
public class SellerLatestOffer {
	@Id
	@Column(name = "OFFER_ID", unique = true, nullable = false)
	private long offerId;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "MRP")
	private String mrp;

	@Column(name = "OFFER_NAME")
	private String offerName;

	@Column(name = "PRODUCT_ATTRIBUTE_ID")
	private long productAttributeId;

	@Column(name = "SELLER_ID")
	private long sellerId;
	
	@Column(name = "OFFER_TYPE")
	private long offerType;

	@Column(name = "OFFER_DESC")
	private String offerDesc;

	/**
	 * @return the offerId
	 */
	public long getOfferId() {
		return offerId;
	}

	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
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
	 * @return the offerName
	 */
	public String getOfferName() {
		return offerName;
	}

	/**
	 * @param offerName the offerName to set
	 */
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	/**
	 * @return the productAttributeId
	 */
	public long getProductAttributeId() {
		return productAttributeId;
	}

	/**
	 * @param productAttributeId the productAttributeId to set
	 */
	public void setProductAttributeId(long productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	/**
	 * @return the sellerId
	 */
	public long getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * @return the offerType
	 */
	public long getOfferType() {
		return offerType;
	}

	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(long offerType) {
		this.offerType = offerType;
	}

	/**
	 * @return the offerDesc
	 */
	public String getOfferDesc() {
		return offerDesc;
	}

	/**
	 * @param offerDesc the offerDesc to set
	 */
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}

	@Override
	public String toString() {
		return "SellerLatestOffer [offerId=" + offerId + ", price=" + price + ", mrp=" + mrp + ", offerName="
				+ offerName + ", productAttributeId=" + productAttributeId + ", sellerId=" + sellerId + ", offerType="
				+ offerType + ", offerDesc=" + offerDesc + "]";
	}
}
