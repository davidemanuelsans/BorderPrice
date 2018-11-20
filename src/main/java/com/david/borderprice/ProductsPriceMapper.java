package com.david.borderprice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.borderprice.Client.MELICompositeClient;
import com.david.borderprice.domain.Response;
import com.david.borderprice.domain.client.MELIResponse;

@Component
public class ProductsPriceMapper {
	
	@Autowired
	ProductsPriceProcessor processor;
	
	@Autowired
	MELICompositeClient client;
	
	public Response map(String query) {
        ArrayList<MELIResponse> response = client.callService("", query);
        
        return processor.process(response);
	}
}
