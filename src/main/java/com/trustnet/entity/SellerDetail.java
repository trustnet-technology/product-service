package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER_DETAIL")
public class SellerDetail {
	@Id
	@Column(name = "SELLER_ID", unique = true, nullable = false)
	private long sellerId;
	
	@Column(name = "SELLER_NAME")
	private String sellerName;
	
	@Column(name = "MAIN_SELLER")
	private Integer mainSeller;
	
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getMainSeller() {
		return mainSeller;
	}

	public void setMainSeller(Integer mainSeller) {
		this.mainSeller = mainSeller;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	

}
