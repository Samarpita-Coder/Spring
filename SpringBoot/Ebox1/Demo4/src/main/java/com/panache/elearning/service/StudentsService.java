package com.panache.elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.panache.elearning.model.Students;
import com.panache.elearning.repository.StudentsRepository;

@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository repository;

	public boolean insert(Students s) {
		
		boolean b = repository.existsById(s.getStuId());	
		if(b) {
			return false;
		}
		repository.save(s);
		return true;
		
	}
	
	public List<Students> findAll(){
		return repository.findAll();	//these methods are in-built
	}
	
}
