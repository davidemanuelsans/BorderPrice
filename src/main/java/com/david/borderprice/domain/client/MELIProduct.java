package com.david.borderprice.domain.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MELIProduct {
	private String id;
	private String title;
	private float price;
	private String currency_id;
	private String condition;
	private String permalink;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	
	
}
