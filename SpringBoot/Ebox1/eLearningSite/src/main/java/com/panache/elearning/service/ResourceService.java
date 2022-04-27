package com.panache.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.panache.elearning.model.Resource;

import com.panache.elearning.repository.ResourceRepository;

@Service
public class ResourceService {

	@Autowired
	private ResourceRepository repository;

	//to get a list of resources for one student (View Resources)
	//will get the stuid from parent table (will be saved in some variable after login)
	public List<Resource> getAllRes(Integer stuid){
		return (List)repository.getAllRes(stuid);
	}
	
	// insert one resource record
	// returns false- already added
	// returns true- resource added
	public boolean insert(Resource s) {
		Resource b = repository.findByName(s.getRes_name());
		if (b != null) {
			return false;
		}
		repository.save(s);
		return true;
	}

	// delete one resource record
	public boolean delete(String name) {
		if (repository.findByName(name)!=null) {
			repository.deleteByName(name);
			return true;
		}
		return false;
	}

//-------------------------------------------------------------------------------------------

	// get one resource record
	public Object find(Integer id) {
		Optional<Resource> o = repository.findById(id); // optional- eliminates null pointer exception
		if (o.isPresent()) {
			return o.get(); // returns the student object
		}
		return null;
	}

	// update one resource record
	public boolean update(Resource s) {
		Optional o = repository.findById(s.getResId());
		if (o.isPresent()) {
			repository.save(s);
			return true;
		}
		return false;
	}

	// get records of all the resources
	public List<Resource> findAll() {
		return repository.findAll(); // these methods are in-built
	}
}
