package com.trustnet.dto;

import java.util.List;

public class ProductHome {
	private List<Product> apparel = null;
	private List<Product> grocery = null;
	private List<Product> home_appliances = null;
	private List<Product> decor = null;
	public List<Product> getApparel() {
		return apparel;
	}
	public void setApparel(List<Product> apparel) {
		this.apparel = apparel;
	}
	public List<Product> getGrocery() {
		return grocery;
	}
	public void setGrocery(List<Product> grocery) {
		this.grocery = grocery;
	}
	public List<Product> getHome_appliances() {
		return home_appliances;
	}
	public void setHome_appliances(List<Product> home_appliances) {
		this.home_appliances = home_appliances;
	}
	public List<Product> getDecor() {
		return decor;
	}
	public void setDecor(List<Product> decor) {
		this.decor = decor;
	}
	

}
