package com.trustnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.trustnet.idgens.IdGenerator;

@Entity
@Table(name = "USER_CART")
public class UserCart {

	@Id
	@Column(name = "USER_CART_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_cart_seq")
    @GenericGenerator(
        name = "user_cart_seq", 
        strategy = "com.trustnet.idgens.IdGenerator", 
        parameters = {
            @Parameter(name = IdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = IdGenerator.VALUE_PREFIX_PARAMETER, value = "US_CT_"),
            @Parameter(name = IdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String userCartId;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PRODUCT_ATTRIBUTE_ID")
	private String productAttributeId;

	@Column(name = "PRODUCT_SELLER_ID")
	private String productSellerId;

	@Column(name = "QUANTITY")
	private String quantity;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	public String getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(String userCartId) {
		this.userCartId = userCartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductAttributeId() {
		return productAttributeId;
	}

	public void setProductAttributeId(String productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	public String getProductSellerId() {
		return productSellerId;
	}

	public void setProductSellerId(String productSellerId) {
		this.productSellerId = productSellerId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
