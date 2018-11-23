package com.david.borderprice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.david.borderprice.domain.Response;
import com.david.borderprice.domain.client.MELIProduct;
import com.david.borderprice.domain.client.MELIResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsPriceProcessorTest {
	
	@Autowired
	ProductsPriceProcessor processor;
	
	private float minimumPrice = 20;
	private float maximumPrice = 30;
	private float averagePrice = (minimumPrice + maximumPrice) / 2;
	
	private ArrayList<MELIResponse> apiResponses = new ArrayList();
	
	@Before
	public void setUp() {
		MELIProduct product1 = new MELIProduct();
		product1.setPrice(minimumPrice);
		MELIProduct product2 = new MELIProduct();
		product2.setPrice(maximumPrice);
		ArrayList<MELIProduct> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		
		MELIResponse apiResponse = new MELIResponse();
		apiResponse.setQuery("iphone");
		apiResponse.setResults(products);
		apiResponse.setSite_id("MLA");
		
		apiResponses.add(apiResponse);
	}
	
	@Test
	public void shouldCorrectlyCalculateAverageMinimumAndMaximumPriceAmongProducts() {
		Response response = processor.process(apiResponses);
		
		assertNotNull(response.getProducts());
		assertThat(response.getProducts().get(0).getAveragePrice()).isEqualTo(averagePrice);
		assertThat(response.getProducts().get(0).getMinPrice()).isEqualTo(minimumPrice);
		assertThat(response.getProducts().get(0).getMaxPrice()).isEqualTo(maximumPrice);
	}

}
