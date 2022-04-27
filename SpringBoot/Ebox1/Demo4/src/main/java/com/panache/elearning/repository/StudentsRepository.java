package com.panache.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panache.elearning.model.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
