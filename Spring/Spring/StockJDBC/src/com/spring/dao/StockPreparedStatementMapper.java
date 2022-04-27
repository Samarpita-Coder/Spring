package com.spring.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Stock;

public class StockPreparedStatementMapper implements RowMapper<Stock> {

	@Override
	public Stock mapRow(ResultSet rs, int row) throws SQLException {
		Stock stock = new Stock();
		stock.setStockId(rs.getInt(1));
		stock.setStockName(rs.getString(2));
		stock.setPrice(rs.getDouble(3));
		java.sql.Date d = rs.getDate(4);
		stock.setDateOfPurchase(d);
		return stock;
	}

}
