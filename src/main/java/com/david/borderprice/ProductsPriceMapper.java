package com.david.borderprice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.david.borderprice.domain.Response;
import com.david.borderprice.domain.client.MELIResponse;

@Component
public class ProductsPriceMapper {
	
	@Autowired
	ProductsPriceProcessor processor;
	
	public Response map(String query) {
		RestTemplate template = new RestTemplate();
        MELIResponse response = template.getForObject("https://api.mercadolibre.com/sites/MPE/search?q="+query, MELIResponse.class);
        
        return processor.process(response);
	}
}
