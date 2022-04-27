package com.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.dao.EmployeeDAO;
import com.springboot.domain.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDAO dao;

    @GetMapping("/list")
	public List<Employee> list(){
     return dao.list();   
	}
    
    @PostMapping("/create")
    public Boolean save(Employee employee){
        return dao.save(employee);
    }
   
}
