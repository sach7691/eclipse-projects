package com.ab.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ab.models.StockPrice;
import com.ab.services.StockPriceService;

@RestController
public class StockPriceController {
	
	@Autowired
	private StockPriceService stockPriceService;
	
	@GetMapping("/price/{name}")
	public List<StockPrice> getPrice(@PathVariable("name") String name) {
		
		String fileName = null;
		
		switch (name) {
		
		  case "lseg":
			  fileName = "lseg-ohlc.csv";
		    break;
		  case "google":
			  fileName = "google-ohlc.csv";
		    break;
		  case "uber":
			  fileName = "uber-ohlc.csv";
		    break;
		  case "apple":
			  fileName = "apple-ohlc.csv";
		    break;
		  case "amazon":
			  fileName = "amazon-ohlc.csv";
		    break;
			
		}	
			
		return stockPriceService.readPriceToDate(fileName);
		
	}
	

}
