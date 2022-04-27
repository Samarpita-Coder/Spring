package com.panache.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.panache.elearning.model.Resource;


@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

	@Query("SELECT r FROM Resource r WHERE r.ownedBy=:name")	//:name is like a variable and will be replaced by the value from request parameter
	Resource findByName(@Param("name") String name);
	
	@Query("DROP r FROM Resource r WHERE r.ownedBy=:name")
	Boolean deleteByName(@Param("name") String name);
	
	@Query("SELECT r FROM Resource r WHERE r.ownedBy=:stuid")
	List<Resource> getAllRes(@Param("stuid") Integer stuid);
}
