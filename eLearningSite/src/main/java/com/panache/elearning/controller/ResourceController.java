package com.panache.elearning.controller;

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

import com.panache.elearning.model.Resource;

import com.panache.elearning.service.ResourceService;


//RequestMapping is generic to GetMapping, PostMapping...etc.
//We can specify the get/post etc methods in the requestmapping second parameter
//By default it is get (in RequestMapping)

@RestController
@RequestMapping("/resource")
public class ResourceController {
	
	@Autowired
	private ResourceService service;	//THE MAPPING WILL TAKE PLACE DEPENDING ON THE OBJECT HERE...IT CAN BE A DAO (CONTAINING DATA IN AN ARRAYLIST/ A SERVICE---INTERFACE REPOSITORY(DATA IN DATABASE)...ETC
	
	//view all resources
	@GetMapping("/view/{stuid}")
	public List<Resource> getAllRes(@RequestBody Integer stuid){
		return service.getAllRes(stuid);
	}
	
	//get records of one student
	@GetMapping("/find/{id}")
	public Object find(@PathVariable("id") Integer id){
		Resource mm = (Resource)service.find(id);	//typecasts from Object to Movie
		if(mm==null) {
			return HttpStatus.NOT_FOUND;
		}
		return mm;
	}
	
	//add resource	
	@PostMapping("/insert")
	public String insert(@RequestBody Resource s) {
		boolean b = service.insert(s);
		if(!b) {
			return "Already Added";
		}
		return "Added";
	}
	
	
	//delete record of one student
	@DeleteMapping("/delete/{name}")
	public Object delete(String name) {
		boolean b = service.delete(name);
		if(b) {
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_FOUND;
	}

	
	//update record of one student
	@PutMapping("/update")
	public Object update(@RequestBody Resource m) {
		boolean b = service.update(m);
		if(b) {
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_FOUND;
	}
		
		
		
}
