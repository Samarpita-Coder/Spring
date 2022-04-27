package com.panache.elearning.repository;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.panache.elearning.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query("SELECT s FROM Student s WHERE s.ownedBy=:uname")	//uname is like a variable
	public Student findByUname(@Param("uname") String uname);
	
}
