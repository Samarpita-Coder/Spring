package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import com.spring.model.Stock;

public class StockPreparedStatementCreator implements PreparedStatementCreator{
	
	private Stock stock;

	public StockPreparedStatementCreator(Stock stock) {
		this.stock=stock;
	}
	
	//to insert
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException{
		String sql = "INSERT INTO STOCK(STOCK_ID, STOCK_NAME, PRICE, DATE_OF_PURCHASE) VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, stock.getStockId());
		ps.setString(2, stock.getStockName());
		ps.setDouble(3, stock.getPrice());
		java.sql.Date d = new java.sql.Date(stock.getDateOfPurchase().getTime());
		ps.setDate(4, d);
		return ps;
	}
		
	
	
}
