package com.david.borderprice.domain;

import java.util.ArrayList;

public class Response {
	private String code;
	private String details;
	private ArrayList<Product> products;
	
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}



	public ArrayList<Product> getProducts() {
		return products;
	}



	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}
}
