package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    
	@Autowired
	private DoctorDAO dao;
	
	@GetMapping("/list")
	public List<Doctor> list(){
		return dao.list();
	}
	
	@GetMapping("/show/{id}")
	public Doctor find(@PathVariable("id") Long id){
		return dao.get(id);
	}
	
	@PostMapping("/create")
	public Doctor insert(@RequestBody Doctor m) {
		return dao.create(m);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable("id") Long id) {
		return dao.delete(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Doctor m) {
		return dao.update(m);
	}
}
