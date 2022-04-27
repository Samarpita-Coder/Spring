package com.spring.dao;

import com.spring.entity.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class OwnerDAO {
    
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
		String sql = "SELECT name, password, email_id, mobile_number FROM owner";
		return (List<Owner>)jdbcTemplate.query(sql, new BeanPropertyRowMapper(Owner.class));
	}
	
	public String getOwnerNumberByName(String Name) {
		try {
			String sql = "SELECT * FROM owner WHERE name=?";
			Owner owner_new = (Owner)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Owner.class), new Object [] {Name});
			return owner_new.getMobileNumber();
		}
		catch(EmptyResultDataAccessException e){
			
			return null;
		}
	}
}
	
    class OwnerPreparedStatementMapper implements RowMapper<Owner> {

		@Override
		public Owner mapRow(ResultSet rs, int row) throws SQLException {
			Owner ow = new Owner();
		
			ow.setName(rs.getString(1));
			ow.setPassword(rs.getString(2));
			ow.setEmailId(rs.getString(3));
			//java.sql.Date d = rs.getDate(4);
			ow.setMobileNumber(rs.getString(4));
			return ow;
		}

	}
	
	
	


