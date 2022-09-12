package com.ab.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
	
	@Id
	private int stockId;
	
	private String stockName;
	
	private double stockPrice;
	
	private int stockQuantity;
	
	private String stockRegion;

	
	public Stock() {
		super();
	}


	public Stock(int stockId, String stockName, double stockPrice, int stockQuantity, String stockRegion) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.stockQuantity = stockQuantity;
		this.stockRegion = stockRegion;
	}


	public void setStockId(int stockId) {
		this.stockId = stockId;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public void setStockRegion(String stockRegion) {
		this.stockRegion = stockRegion;
	}


	public int getStockId() {
		return stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public double getStockPrice() {
		return stockPrice;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	public String getStockRegion() {
		return stockRegion;
	}
	

}
