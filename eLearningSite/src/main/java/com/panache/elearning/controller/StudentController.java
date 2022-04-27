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

import com.panache.elearning.model.Student;
import com.panache.elearning.service.StudentService;

//RequestMapping is generic to GetMapping, PostMapping...etc.
//We can specify the get/post etc methods in the requestmapping second parameter
//By default it is get (in RequestMapping)

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service; // THE MAPPING WILL TAKE PLACE DEPENDING ON THE OBJECT HERE...IT CAN BE A DAO
									// (CONTAINING DATA IN AN ARRAYLIST/ A SERVICE---INTERFACE REPOSITORY(DATA IN
									// DATABASE)...ETC

	// insert record of one student (Register)
	@PostMapping("/register")
	public HttpStatus insert(@RequestBody Student s) {
		boolean b = service.insert(s);
		if (!b) {
			return HttpStatus.FOUND;
		}
		return HttpStatus.OK;
	}
	
	//validate uname and pwd (Login)
	@GetMapping("/login/{uname}/{pwd}")
	public HttpStatus login(@RequestBody String uname, String pwd) {
		boolean val = service.searchByUname(uname, pwd);
		if(val) {
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_FOUND;
	}
	
	@GetMapping("/viewProfile/{stuid}")
	public Student view(@RequestBody Integer stuid) {
		return service.view(stuid);
	}

	// update record of one student	(Edit profile)
	@PutMapping("/editProfile")
	public Object editProfile(@RequestBody Student m) {
		boolean b = service.update(m);
		if (b) {
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_FOUND;
	}
	
//-------------------------------------------------------------------------------------------

	// delete record of one student
	@DeleteMapping("/delete/{id}")
	public Object delete(@PathVariable("id") Integer id) {
		boolean b = service.delete(id);
		if (b) {
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_FOUND;
	}

	// get records of all students
	@GetMapping("/findAll")
	public List<Student> findAll() {
		return service.findAll();
	}

	// get record of one student
	@GetMapping("/find/{id}")
	public Object find(@PathVariable("id") Integer id) {
		Student mm = (Student) service.find(id); // typecasts from Object to Movie
		if (mm == null) {
			return HttpStatus.NOT_FOUND;
		}
		return mm;
	}

}
