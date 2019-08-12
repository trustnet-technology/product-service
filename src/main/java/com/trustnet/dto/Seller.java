package com.trustnet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seller {

	@JsonProperty("seller_id")
	private long sellerId;

	@JsonProperty("SELLER_NAME")
	private String sellerName;

	@JsonProperty("MAIN_SELLER")
	private Integer mainSeller;

	@JsonProperty("ADDRESS")
	private String address;
	@JsonProperty("CONTACT_NUMBER")
	private String contactNumber;

	@JsonProperty("OPENING_HOUR")
	private String openingHour;

	@JsonProperty("CLOSING_HOUR")
	private String closingHour;

	@JsonProperty("PINCODE")
	private String pincode;

	@JsonProperty("PROFILE_IMAGE")
	private String profileImage;

	@JsonProperty("LAT")
	private String lat;

	@JsonProperty("LON")
	private String lon;

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

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