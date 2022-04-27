package com.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.StockBO;
import com.spring.model.Stock;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		StockBO bo = (StockBO)ctx.getBean("bo");
		
		Stock s1 = new Stock(1, "HDFC", 9000, sdf.parse("1111-09-30"));
		Stock s2 = new Stock(2, "ICICI", 9000, sdf.parse("1111-09-30"));
		Stock s3 = new Stock(3, "AXIS", 9000, sdf.parse("1111-09-30"));
		bo.addStock(s1);	
		bo.addStock(s2);
		bo.addStock(s3);
		
		Stock s4 = new Stock(4, "AXIS", 9000, sdf.parse("1111-09-30"));
		Stock s = bo.exists(4);
		System.out.println(s.getPrice());
		
		
		
		//bo.modStock(s);
		
		List<Stock> list = bo.getAllStocks();
		for(Stock x: list) {
			System.out.println(x);
		}
		
	}

}
