
package com.trustnet.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Prodetail {

@JsonProperty("image_urls")
private List<Object> imageUrls = null;
@JsonProperty("name")
private String name;
@JsonProperty("category")
private String category;
@JsonProperty("details")
private String details;
@JsonProperty("mrp")
private String mrp;
@JsonProperty("price")
private String price;
@JsonProperty("sellers")
private List<Seller> sellers = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("image_urls")
public List<Object> getImageUrls() {
return imageUrls;
}

@JsonProperty("image_urls")
public void setImageUrls(List<Object> imageUrls) {
this.imageUrls = imageUrls;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

@JsonProperty("details")
public String getDetails() {
return details;
}

@JsonProperty("details")
public void setDetails(String details) {
this.details = details;
}

@JsonProperty("mrp")
public String getMrp() {
return mrp;
}

@JsonProperty("mrp")
public void setMrp(String mrp) {
this.mrp = mrp;
}

@JsonProperty("price")
public String getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(String price) {
this.price = price;
}

@JsonProperty("sellers")
public List<Seller> getSellers() {
return sellers;
}

@JsonProperty("sellers")
public void setSellers(List<Seller> sellers) {
this.sellers = sellers;
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

