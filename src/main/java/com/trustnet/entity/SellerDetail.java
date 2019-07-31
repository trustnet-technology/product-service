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
	
	@Column(name = "OPENING_HOUR")
	private String openingHour;
	
	@Column(name = "CLOSING_HOUR")
	private String closingHour;
	
	@Column(name = "PINCODE")
	private String pincode;
	
	@Column(name = "PROFILE_IMAGE")
	private String profileImage;
	
	@Column(name = "LAT")
	private String lat;
	
	@Column(name = "LON")
	private String lon;

	
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

	public String getOpeningHour() {
		return openingHour;
	}

	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}

	public String getClosingHour() {
		return closingHour;
	}

	public void setClosingHour(String closingHour) {
		this.closingHour = closingHour;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

}
