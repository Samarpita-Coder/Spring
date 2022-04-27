package com.spring.dao;

import com.spring.entity.*;
import com.spring.model.Stock;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class OwnerDAO2 {
    
	@Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    	this.jdbcTemplate=jdbcTemplate;
	}
    
    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.jdbcTemplate=new JdbcTemplate();
        this.jdbcTemplate.setDataSource(this.dataSource);
    }
	
	public List<Owner> getAllOwners(){
		String sql = "SELECT id, name, password, email_id, mobile_number FROM owner";
		return (List<Owner>)jdbcTemplate.query(sql, new BeanPropertyRowMapper(Owner.class));	
	}
	
	public String getOwnerById(int id) {
		try {
			String sql = "SELECT * FROM owner WHERE id=?";
			Owner owner_new = (Owner)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Owner.class), new Object [] {id});
			return owner_new.getName();
		}
		catch(EmptyResultDataAccessException e){
			
			return null;
		}
		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM owner WHERE id=?";
		jdbcTemplate.update(sql, new Object[] {id});
	}
	
}

	

