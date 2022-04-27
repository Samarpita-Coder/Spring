package com.panache.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.panache.elearning.model.Student;
import com.panache.elearning.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	// insert one student record (registration)
	//returns false if already registered
	public boolean insert(Student s) {
		Student b = repository.findByUname(s.getUname());
		if (b!=null) {
			// already registered
			return false;
		}
		repository.save(s);
		// registration done
		return true;
	}
	
	//validate uname and pwd (login)
	//returns true if login successful else, wrong uname/pwd
	public boolean searchByUname(String uname, String pwd) {
		Student st = (Student)repository.findByUname(uname);
		boolean result;
		if(st!=null) {
			if(pwd.equals(st.getPwd())) {
				result=true;
			}else {
				result=false;
			}
		}else {
			result=false;
		}
		return result;
	}
	
	//get the stuid from uname (while/after login)
	public Integer getStuId(String uname) {
		Student st = (Student)repository.findByUname(uname);
		return st.getStuId();
	}
	
	//view profile- when clicks on it, the stuid value will be fetched 
	public Student view(Integer stuid) {
		Optional<Student> s = repository.findById(stuid);
		if (s.isPresent()) {
			return (Student)s;		//??????????
		}
		return null;
	}

	// update one student record (edit profile)
	public boolean update(Student s) {
		Optional o = repository.findById(s.getStuId());
		if (o.isPresent()) {
			repository.save(s);
			return true;
		}
		return false;
	}
	
//------------------------------------------------------------------------------------------

	// get one student record
	public Object find(Integer id) {
		Optional<Student> o = repository.findById(id); // optional- eliminates null pointer exception
		if (o.isPresent()) {
			return o.get(); // returns the student object
		}
		return null;
	}

	// delete one student record
	public boolean delete(Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
	
	// get records of all the students
		public List<Student> findAll() {
			return (List) repository.findAll(); // these methods are in-built
		}

}
