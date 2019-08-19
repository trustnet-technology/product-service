package com.trustnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER_DETAIL")
public class SellerDetail {
	@Id
	@Column(name = "SELLER_ID", unique = true, nullable = false)
	private String sellerId;
	
	@Column(name = "SELLER_NAME")
	private String sellerName;
	
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
	
	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	public Date modifiedDate;
	

	@Column(name = "CITY_ID")
	private String cityId;


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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}


	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	/**
	 * @return the openingHour
	 */
	public String getOpeningHour() {
		return openingHour;
	}


	/**
	 * @param openingHour the openingHour to set
	 */
	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}


	/**
	 * @return the closingHour
	 */
	public String getClosingHour() {
		return closingHour;
	}


	/**
	 * @param closingHour the closingHour to set
	 */
	public void setClosingHour(String closingHour) {
		this.closingHour = closingHour;
	}


	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}


	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	/**
	 * @return the profileImage
	 */
	public String getProfileImage() {
		return profileImage;
	}


	/**
	 * @param profileImage the profileImage to set
	 */
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
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
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}


	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}


	@Override
	public String toString() {
		return "SellerDetail [sellerId=" + sellerId + ", sellerName=" + sellerName + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", openingHour=" + openingHour + ", closingHour=" + closingHour
				+ ", pincode=" + pincode + ", profileImage=" + profileImage + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", cityId=" + cityId + "]";
	}

	
}
