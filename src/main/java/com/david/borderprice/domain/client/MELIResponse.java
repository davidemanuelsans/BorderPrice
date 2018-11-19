package com.david.borderprice.domain.client;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MELIResponse {
	private String site_id;
	private String query;
	private ArrayList<MELIProduct> results;
	public String getSite_id() {
		return site_id;
	}
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public ArrayList<MELIProduct> getResults() {
		return results;
	}
	public void setResults(ArrayList<MELIProduct> results) {
		this.results = results;
	}
	
	
}
