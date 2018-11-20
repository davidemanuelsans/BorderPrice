package com.david.borderprice.domain;

public class ProductBuilder {

	private float averagePrice = 0;
	private float minPrice = 0;
	private float maxPrice = 0;
	private String name = "";
	private String country = "";
	private String currency = "N/A";
	
	public ProductBuilder withAveragePrice(float averagePrice) {
		this.averagePrice = averagePrice;
		
		return this;
	}
	
	public ProductBuilder withMinPrice(float minPrice) {
		this.minPrice = minPrice;
		
		return this;
	}
	
	public ProductBuilder withMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
		
		return this;
	}
	
	
	
	public ProductBuilder withName(String name) {
		this.name = name;
		
		return this;
	}
	
	public ProductBuilder withCountry(String country) {
		this.country = country;
		
		return this;
	}
	
	public ProductBuilder withCurrency(String currency) {
		this.currency = currency;
		
		return this;
	}
		
	public Product build() {
		Product result = new Product();
		result.setAveragePrice(this.averagePrice);
		result.setMaxPrice(this.maxPrice);
		result.setMinPrice(this.minPrice);
		result.setCountry(this.country);
		result.setName(this.name);
		
		return result;
	}
}
