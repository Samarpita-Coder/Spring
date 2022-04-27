package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Author;
import com.springboot.repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

		@Autowired
		private AuthorRepository rep;
	
		@GetMapping("/fetchAll")
		public List<Author> fetchAllAuthors(){
			return (List)rep.findAll();
		}
		
		@PostMapping("/addAuthor")
		public Author addAuthor(@RequestBody Author a) {
			rep.save(a);
			return a;
		}
		
		
}
