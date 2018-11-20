package com.david.borderprice.domain;

public class Product {
	
	private float averagePrice;
	private float minPrice;
	private float maxPrice;
	private String name;
	private String country;
	private String currency;
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurency(String currency) {
		this.currency = currency;
	}
	
	public float getAveragePrice() {
		return averagePrice;
	}
	public void setAveragePrice(float averagePrice) {
		this.averagePrice = averagePrice;
	}
	public float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}
	public float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
