package com.david.borderprice.Client;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.borderprice.domain.client.MELIResponse;

@Component
public class MELICompositeClient implements Client {
	
	@Autowired
	MELIClient atomicClient;
	
	private String[] countriesServed = {"LA", "LU", "LB", "PY", "LC", "PE", "CO", "LM"};

	@Override
	public ArrayList<MELIResponse> callService(String Country, String query) {
		ArrayList<MELIResponse> result = new ArrayList<>();
		
		for (String localCountry : countriesServed) {
			result.add(atomicClient.callService(localCountry, query).get(0));
		}
		
		return result;
	}
	
}
