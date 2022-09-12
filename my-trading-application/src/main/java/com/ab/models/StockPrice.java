package com.ab.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockPrice {
	
	@Id
	private int priceId;
	
	private Timestamp dateTime;
	
	private double _dateTime;
	
	private double open;
	
	private double high;
	
	private double low;
	
	private double close;

	
	public StockPrice() {
		super();
	}

	
	public StockPrice(Timestamp dateTime, double open, double high, double low, double close) {
		super();
		this.dateTime = dateTime;
		this._dateTime = dateTime.getTime();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
	}
	
//	public StockPrice(double dateTime, double open, double high, double low, double close) {
//		super();
//		this._dateTime = dateTime;
//		this.open = open;
//		this.high = high;
//		this.low = low;
//		this.close = close;
//	}


	public StockPrice(int priceId, Timestamp dateTime, double open, double high, double low, double close) {
		super();
		this.priceId = priceId;
		this.dateTime = dateTime;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
	}


	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}


	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}


	public void setOpen(double open) {
		this.open = open;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public void setLow(double low) {
		this.low = low;
	}


	public void setClose(double close) {
		this.close = close;
	}


	public int getPriceId() {
		return priceId;
	}


	public Timestamp getDateTime() {
		return dateTime;
	}


	public double getOpen() {
		return open;
	}


	public double getHigh() {
		return high;
	}


	public double getLow() {
		return low;
	}


	public double getClose() {
		return close;
	}


	public double get_dateTime() {
		return _dateTime;
	}


	public void set_dateTime(double _dateTime) {
		this._dateTime = _dateTime;
	}


	@Override
	public String toString() {
		return "StockPrice [dateTime=" + _dateTime + ", open=" + open + ", high=" + high + ", low=" + low + ", close="
				+ close + "]";
	}

}
