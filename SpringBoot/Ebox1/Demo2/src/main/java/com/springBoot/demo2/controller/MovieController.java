package com.springBoot.demo2.controller;

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

import com.springBoot.demo2.dao.MovieDAO;
import com.springBoot.demo2.model.Movie;

//RequestMapping is generic to GetMapping, PostMapping...etc.
//We can specify the get/post etc methods in the requestmapping second parameter
//By default it is get (in RequestMapping)

@RestController
@RequestMapping("/movie")
public class MovieController {
	
		@Autowired
		private MovieDAO dao;
		
		@GetMapping("/findAll")
		public List<Movie> findAll(){
			return dao.findAll();
		}
		
		@GetMapping("/find/{id}")
		public Object find(@PathVariable("id") Long id){
			Movie mm = dao.find(id);
			if(mm==null) {
				return HttpStatus.NOT_FOUND;
			}
			return mm;
		}
		
		@PostMapping("/insert")
		public boolean insert(@RequestBody Movie m) {
			return dao.insert(m);
		}
		
		@DeleteMapping("/delete/{id}")
		public Object delete(@PathVariable("id") Long id) {
			boolean b = dao.delete(id);
			if(b) {
				return HttpStatus.OK;
			}
			return HttpStatus.NOT_FOUND;
		}
		
		@PutMapping("/update")
		public Object update(@RequestBody Movie m) {
			boolean b = dao.update(m);
			if(b) {
				return HttpStatus.OK;
			}
			return HttpStatus.NOT_FOUND;
		}
		
		
		
		
}
