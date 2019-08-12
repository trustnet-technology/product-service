package com.trustnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_Attribute")
public class PrductAttribute {

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "MRP")
	private String mrp;

	@Column(name = "PRODUCT_ID")
	private long productId;

	@Column(name = "SP")
	private String sp;

	@Column(name = "CREATED_DATE")
	public Date createdDate;

	@Column(name = "SIZE")
	public String size;

	@Column(name = "COLOR")
	public String color;

	@Column(name = "weight")
	public String weight;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
