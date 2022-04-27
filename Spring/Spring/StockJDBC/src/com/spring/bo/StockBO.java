package com.spring.bo;
//repository- database access (DAO)
//component/service- business logic (BO)

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.StockDAO;
import com.spring.model.Stock;

@Component
public class StockBO {
	
	@Autowired
	private StockDAO dao;
	
	public void setDao(StockDAO dao) {
		this.dao=dao;
	}
	
	public Stock addStock(Stock stock) {
		return dao.insert(stock);
	}
	
	public void modStock(Stock stock) {
		dao.update(stock);
	}
	
	public Stock exists(int id) {
		return dao.find(id);
	}
	
	public List<Stock> getAllStocks(){
		return dao.findAll();
	}
	
	public void delStock(int id) {
		dao.delete(id);
	}
	
}
