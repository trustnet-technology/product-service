package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {
	@Id
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	private String categoryId;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	@Column(name = "TOP_CATEGORY")
	private Integer topCategory;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getTopCategory() {
		return topCategory;
	}

	public void setTopCategory(Integer topCategory) {
		this.topCategory = topCategory;
	}

	

}
