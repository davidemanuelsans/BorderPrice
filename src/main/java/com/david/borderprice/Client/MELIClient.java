package com.david.borderprice.Client;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.david.borderprice.domain.client.MELIResponse;

@Component
public class MELIClient implements Client {
	
	private RestTemplate template = new RestTemplate();

	// TODO: Exception handling
	@Override
	public ArrayList<MELIResponse> callService(String country, String query) {
		ArrayList<MELIResponse> result = new ArrayList<>();
		result.add(template.getForObject("https://api.mercadolibre.com/sites/M"+country+"/search?q="+query, MELIResponse.class));
		
		return result;
	}
}
