package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.model.Stock;

public class StockDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public Stock find(int id) {
		try {
			String sql = "SELECT * FROM STOCK WHERE STOCK_ID=?";
			//define a StockPreparedStatementMapper for retrieving Stock object using id
			//return (Stock) template.queryForObject(sql, new StockPreparedStatementMapper(), new Object[] {id});
			//BeanPropertyRowMapper is a shortcut- no need to create separate Mapper class then
			//RowMapper implementation which can automatically map a row to a new instance of the specified class.
			return (Stock) template.queryForObject(sql, new Object [] {id}, new BeanPropertyRowMapper(Stock.class));
			
		}
		catch(EmptyResultDataAccessException e){
			System.out.println("Stock with id "+id+" not found");
			return null;
		}
	}
	
	public Stock insert(Stock stock) {
		try {
			//ps creator- sql statement inside class
			//ps setter- sql statement in dao (passed as parameter)
			StockPreparedStatementCreator ps = new StockPreparedStatementCreator(stock);
			template.update(ps);
			System.out.println("Successfully inserted.");
			return stock;
		}
		catch(DuplicateKeyException e) {
			System.out.println("Could not create stock with id: "+stock.getStockId());
			return null;
		}
	}
	
	//creater- 1 argument
	//setter- 2 arguments
	public void update(Stock stock) {
		String sql = "UPDATE STOCK SET STOCK_NAME=?, PRICE=?, DATE_OF_PURCHASE=? WHERE STOCK_ID=?";
		StockPreparedStatementSetter ps = new StockPreparedStatementSetter(stock);
		template.update(sql,ps);
		System.out.println("Successfully updated");
	}
	
	public List<Stock> findAll(){
		String sql = "SELECT STOCK_ID, STOCK_NAME, PRICE, DATE_OF_PURCHASE FROM STOCK";
		return (List<Stock>)template.query(sql, new StockPreparedStatementMapper());
		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM STOCK WHERE STOCK_ID=?";
		template.update(sql, new Object[] {id});
	}
}
