package com.spring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.spring.model.Stock;

public class StockPreparedStatementSetter implements PreparedStatementSetter {
	
	private Stock stock;

	public StockPreparedStatementSetter(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, stock.getStockName());
		ps.setDouble(2, stock.getPrice());
		java.sql.Date d = new java.sql.Date(stock.getDateOfPurchase().getTime());
		ps.setDate(3, d);
		ps.setInt(4, stock.getStockId());

	}

}
