package com.david.borderprice;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.david.borderprice.domain.Response;
import com.david.borderprice.domain.client.MELIResponse;
import com.david.borderprice.domain.client.MELIProduct;

@Component
public class ProductsPriceProcessor {
	public Response process(MELIResponse apiResponse) {
		int sum = 0;
		for (MELIProduct product : apiResponse.getResults()) {
			sum += product.getPrice();
		}
		Response response = new Response();
		response.setCode(apiResponse.getQuery()+" en "+apiResponse.getSite_id());
		response.setDetails("promedio de precios="+sum/apiResponse.getResults().size());
		
		return response;
	}
}
