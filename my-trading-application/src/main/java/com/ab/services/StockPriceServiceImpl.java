package com.ab.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.models.StockPrice;
import com.ab.repositories.StockPriceReopsitory;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceReopsitory stockPriceReopsitory;
	
	
	@Override
	public List<StockPrice> readPriceFromFile(String fileName) {
		
		return stockPriceReopsitory.readPriceFromFile(fileName);
	}


	@Override
	public List<StockPrice> readPriceToDate(String fileName) {
			
		return stockPriceReopsitory.readPriceToDate(fileName);
	}

}
