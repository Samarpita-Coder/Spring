package com.spring.dao;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.Types;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import javax.sql.DataSource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("eventDAO")
public class EventDAO {
    
    private DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public DataSource getDataSource()
        {
            return datasource;
        }
        public void setDataSource(DataSource dataSource)
        {
            this.jdbcTemplate= new JdbcTemplate(dataSource);
        }
    
	public List<Event> getAllEvents(){
        //fill your code
		return null;
    }
    
    public Hall getHallDetail(int id){
		// fill your code
		return null;
        
    }
    
    public Hall findHallByName(String name){
		// fill your code
		return null;        
    }

	public Event getEventById(int id){
		     // fill your code
		return null;           
    }
 public void removeEvent(int id){
        // fill your code
		return null;        
    }
    
    public void createEvent(int id,String eventName,String organiser,String organiserNumber,Hall hall) {
        // fill your code
		return null;   
            
    }
    
    
}