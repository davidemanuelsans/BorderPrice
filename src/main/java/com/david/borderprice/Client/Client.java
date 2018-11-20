package com.david.borderprice.Client;

import java.util.ArrayList;
import com.david.borderprice.domain.client.MELIResponse;

public interface Client {
	public ArrayList<MELIResponse> callService(String Country, String query);
}
