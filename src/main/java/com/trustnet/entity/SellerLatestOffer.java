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
	private long productSellerId;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "MRP")
	private String mrp;

	@Column(name = "OFFER_NAME")
	private String offerName;

	@Column(name = "PRODUCT_ID", unique = false,nullable = false)
	private long productId;

	@Column(name = "SELLER_ID",unique = false, nullable = false)
	private long sellerId;

	@Column(name = "OFFER_DESC")
	private String offerDesc;

	public long getProductId() {
		return productId;
	}

	public long getProductSellerId() {
		return productSellerId;
	}

	public void setProductSellerId(long productSellerId) {
		this.productSellerId = productSellerId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferDesc() {
		return offerDesc;
	}

	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}

}
