package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
