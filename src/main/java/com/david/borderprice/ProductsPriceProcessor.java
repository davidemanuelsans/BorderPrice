package com.david.borderprice;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.david.borderprice.domain.Product;
import com.david.borderprice.domain.ProductBuilder;
import com.david.borderprice.domain.Response;
import com.david.borderprice.domain.client.MELIResponse;
import com.david.borderprice.domain.client.MELIProduct;

@Component
public class ProductsPriceProcessor {
	public Response process(ArrayList<MELIResponse> apiResponse) {
		Response finalResponse = new Response();
		finalResponse.setCode("xxxyyy");
		finalResponse.setDetails("no details");
		
		ArrayList<Product> products =  new ArrayList<>();
		ProductBuilder productBuilder = new ProductBuilder();
		
		for (MELIResponse response : apiResponse) {
			float maxPrice = Float.MIN_VALUE;
			float minPrice = Float.MAX_VALUE;
			float sumAvg = 0;
			
			for (MELIProduct product : response.getResults()) {
				float price = product.getPrice();
				
				maxPrice = Math.max(maxPrice, price);
				minPrice = Math.min(minPrice, price);
				sumAvg += price;
			}
			sumAvg = sumAvg / response.getResults().size();
			
			products.add(productBuilder
						.withAveragePrice(sumAvg)
						.withMaxPrice(maxPrice)
						.withMinPrice(minPrice)
						.withCountry(response.getSite_id())
						.withName(response.getResults().get(0).getTitle())
						.withCurrency(response.getResults().get(0).getCurrency_id())
						.build());
		}
		finalResponse.setProducts(products);
		
		return finalResponse;
	}
}
