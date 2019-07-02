package com.trustnet.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Seller {

@JsonProperty("seller_id")
private Long sellerId;
@JsonProperty("name")
private String name;
@JsonProperty("location")
private String location;
@JsonProperty("rating")
private String rating;
@JsonProperty("price")
private String price;
@JsonProperty("mrp")
private String mrp;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("seller_id")
public Long getSellerId() {
return sellerId;
}

@JsonProperty("seller_id")
public void setSellerId(Long sellerId) {
this.sellerId = sellerId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("location")
public String getLocation() {
return location;
}

@JsonProperty("location")
public void setLocation(String location) {
this.location = location;
}

@JsonProperty("rating")
public String getRating() {
return rating;
}

@JsonProperty("rating")
public void setRating(String rating) {
this.rating = rating;
}

@JsonProperty("price")
public String getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(String price) {
this.price = price;
}

@JsonProperty("mrp")
public String getMrp() {
return mrp;
}

@JsonProperty("mrp")
public void setMrp(String mrp) {
this.mrp = mrp;
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