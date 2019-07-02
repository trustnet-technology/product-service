package com.trustnet.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"comment",
"rating"
})
public class TopsReview {

@JsonProperty("comment")
private String comment;
@JsonProperty("rating")
private String rating;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("comment")
public String getComment() {
return comment;
}

@JsonProperty("comment")
public void setComment(String comment) {
this.comment = comment;
}

@JsonProperty("rating")
public String getRating() {
return rating;
}

@JsonProperty("rating")
public void setRating(String rating) {
this.rating = rating;
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