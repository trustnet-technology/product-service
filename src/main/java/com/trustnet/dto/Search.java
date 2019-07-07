package com.trustnet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
	private String category;
	@JsonProperty("price-range")
	private String priceRange;
	@JsonProperty("location-range")
	private String locationRange;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	public String getLocationRange() {
		return locationRange;
	}
	public void setLocationRange(String locationRange) {
		this.locationRange = locationRange;
	}
	
	
}
