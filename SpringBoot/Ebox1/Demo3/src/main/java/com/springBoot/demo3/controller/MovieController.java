package com.springBoot.demo3.controller;

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


import com.springBoot.demo3.model.Movie;
import com.springBoot.demo3.service.MovieService;

//RequestMapping is generic to GetMapping, PostMapping...etc.
//We can specify the get/post etc methods in the requestmapping second parameter
//By default it is get (in RequestMapping)

@RestController
@RequestMapping("/movie")
public class MovieController {
	
		@Autowired
		private MovieService service;	//THE MAPPING WILL TAKE PLACE DEPENDING ON THE OBJECT HERE...IT CAN BE A DAO (CONTAINING DATA IN AN ARRAYLIST/ A SERVICE---INTERFACE REPOSITORY(DATA IN DATABASE)...ETC
		
		@GetMapping("/findAll")
		public List<Movie> findAll(){
			return service.getAll();
		}
		
		@GetMapping("/find/{id}")
		public Object find(@PathVariable("id") Long id){
			Movie mm = (Movie)service.find(id);	//typecasts from Object to Movie
			if(mm==null) {
				return HttpStatus.NOT_FOUND;
			}
			return mm;
		}
		
		@PostMapping("/insert")
		public HttpStatus insert(@RequestBody Movie m) {
			boolean b = service.insert(m);
			if(!b) {
				return HttpStatus.FOUND;
			}
			return HttpStatus.OK;
		}
		
		@DeleteMapping("/delete/{id}")
		public Object delete(@PathVariable("id") Long id) {
			boolean b = service.delete(id);
			if(b) {
				return HttpStatus.OK;
			}
			return HttpStatus.NOT_FOUND;
		}
		
		@PutMapping("/update")
		public Object update(@RequestBody Movie m) {
			boolean b = service.update(m);
			if(b) {
				return HttpStatus.OK;
			}
			return HttpStatus.NOT_FOUND;
		}
		
		
		
		
}
