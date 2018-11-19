package com.david.borderprice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.david.borderprice.ProductsPriceMapper;
import com.david.borderprice.domain.Response;

@RestController
public class PricesResource {
	
	@Autowired
	ProductsPriceMapper mapper;
	
	@GetMapping(("/Prices/{query}"))
	public Response getComparison(@PathVariable String query) {
		return mapper.map(query);
	}

}
