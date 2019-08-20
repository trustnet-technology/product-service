package com.trustnet.entity;

import java.util.List;

import com.trustnet.dto.ProductSellerDTO;

public class ProductDetailResponse {

	ProductAttribute productAttribute;

	List<ProductSellerDTO> productSellers;

	/**
	 * @return the productAttribute
	 */
	public ProductAttribute getProductAttribute() {
		return productAttribute;
	}

	/**
	 * @param productAttribute the productAttribute to set
	 */
	public void setProductAttribute(ProductAttribute productAttribute) {
		this.productAttribute = productAttribute;
	}

	/**
	 * @return the productSellers
	 */
	public List<ProductSellerDTO> getProductSellers() {
		return productSellers;
	}

	/**
	 * @param productSellers the productSellers to set
	 */
	public void setProductSellers(List<ProductSellerDTO> productSellers) {
		this.productSellers = productSellers;
	}

	@Override
	public String toString() {
		return "ProductDetailResponse [productAttribute=" + productAttribute + ", productSellers=" + productSellers
				+ "]";
	}

}
