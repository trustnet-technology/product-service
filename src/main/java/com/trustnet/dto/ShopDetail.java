
package com.trustnet.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopDetail {

	@JsonProperty("shop_id")
	private Long shopId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("rating")
	private String rating;
	@JsonProperty("working_hours")
	private String workingHours;
	@JsonProperty("contact")
	private String contact;
	@JsonProperty("location")
	private String location;
	@JsonProperty("category")
	private String category;
	@JsonProperty("seller_detatil")
	private String sellerDetatil;
	@JsonProperty("tops_reviews")
	private List<?> topsReviews = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("shop_id")
	public Long getShopId() {
		return shopId;
	}

	@JsonProperty("shop_id")
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("rating")
	public String getRating() {
		return rating;
	}

	@JsonProperty("rating")
	public void setRating(String rating) {
		this.rating = rating;
	}

	@JsonProperty("working_hours")
	public String getWorkingHours() {
		return workingHours;
	}

	@JsonProperty("working_hours")
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	@JsonProperty("contact")
	public String getContact() {
		return contact;
	}

	@JsonProperty("contact")
	public void setContact(String contact) {
		this.contact = contact;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("seller_detatil")
	public String getSellerDetatil() {
		return sellerDetatil;
	}

	@JsonProperty("seller_detatil")
	public void setSellerDetatil(String sellerDetatil) {
		this.sellerDetatil = sellerDetatil;
	}

	@JsonProperty("tops_reviews")
	public List<?> getTopsReviews() {
		return topsReviews;
	}

	@JsonProperty("tops_reviews")
	public void setTopsReviews(List<?> topsReviews) {
		this.topsReviews = topsReviews;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
