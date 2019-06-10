package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_DETAIL")
public class ProductDetail {
	@Id
	@Column(name = "PRODUCT_DETAIL_ID", unique = true, nullable = false)
	private long productDetailId;
	@Column(name = "PRODUCT_DESC")
	private String productdESC;

	@Column(name = "PRODUCT_ID", nullable = false)
	private long productId;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

}
