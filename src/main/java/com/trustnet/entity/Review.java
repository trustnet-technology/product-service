package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class Review {
	@Id
	@Column(name = "REVIEW_ID", unique = true, nullable = false)
	private long reviewId;
	
	@Column(name = "COMMENT")
	private String comment;

	@Column(name = "RATING")
	private Integer topCategory;
	
	@Column(name = "SELLER_ID", unique = false,nullable = false)
	private long sellerId;

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getTopCategory() {
		return topCategory;
	}

	public void setTopCategory(Integer topCategory) {
		this.topCategory = topCategory;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

}
