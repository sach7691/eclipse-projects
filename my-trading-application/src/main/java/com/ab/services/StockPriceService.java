package com.ab.services;
import java.util.List;

import com.ab.models.StockPrice;

public interface StockPriceService {
	
	public List<StockPrice> readPriceFromFile(String fileName);
	public List<StockPrice> readPriceToDate(String fileName);
	

}
