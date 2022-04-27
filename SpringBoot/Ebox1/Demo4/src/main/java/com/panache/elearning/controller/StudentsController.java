package com.panache.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panache.elearning.model.Students;
import com.panache.elearning.service.StudentsService;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentsService service;
	
	@PostMapping("/add")
	public HttpStatus insert(@RequestBody Students s) {
		boolean b = service.insert(s);
		if(!b) {
			return HttpStatus.FOUND;
		}
		return HttpStatus.OK;
	}
	
	@GetMapping("/list")
	public List<Students> findAll(){
		return service.findAll();
	}
	
}
