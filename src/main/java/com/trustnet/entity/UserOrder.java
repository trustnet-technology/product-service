package com.trustnet.entity;

import java.util.Date;

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
@Table(name = "USER_ORDER")
public class UserOrder {

	@Id
	@Column(name = "USER_ORDER_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_ord_seq")
    @GenericGenerator(
        name = "user_ord_seq", 
        strategy = "com.trustnet.idgens.IdGenerator", 
        parameters = {
            @Parameter(name = IdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = IdGenerator.VALUE_PREFIX_PARAMETER, value = "US_OR_"),
            @Parameter(name = IdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String userOrderId;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PRODUCT_ATTRIBUTE_ID")
	private String productAttributeId;

	@Column(name = "PRODUCT_SELLER_ID")
	private String productSellerId;

	@Column(name = "QUANTITY")
	private String quantity;

	@Column(name = "STATUS")
	private String statue;

	@Column(name = "ORDER_PAYMENT_MODE")
	private String orderPaymentMode;
	
	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	public Date modifiedDate;

	public String getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(String userOrderId) {
		this.userOrderId = userOrderId;
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

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	public String getOrderPaymentMode() {
		return orderPaymentMode;
	}

	public void setOrderPaymentMode(String orderPaymentMode) {
		this.orderPaymentMode = orderPaymentMode;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}
