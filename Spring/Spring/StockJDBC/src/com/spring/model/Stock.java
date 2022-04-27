package com.spring.model;

import java.util.Date;

//java.util.date- java programs
//java.sql.date- writing to database(jdbc)- convert in dao


public class Stock {
	
	private int stockId;
	private String stockName;
	private double price;
	private Date dateOfPurchase;
	
	public Stock() {}
	
	public Stock(int stockId, String stockName, double price, Date dateOfPurchase) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.price = price;
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public Stock(String stockName, double price, Date dateOfPurchase) {
		super();
		//this.stockId = stockId;
		this.stockName = stockName;
		this.price = price;
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", price=" + price + ", dateOfPurchase="
				+ dateOfPurchase + "]";
	}
	
	
	
	
}
