package com.springBoot.demo3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.demo3.model.Movie;
import com.springBoot.demo3.repository.MovieRepository;

@Service
public class MovieService {

		@Autowired
		private MovieRepository repository;
		
		
		public List<Movie> getAll(){
			return repository.findAll();	//these methods are in-built
		}
		
		
		public boolean insert(Movie m) {
			boolean b = repository.existsById(m.getMovieId());
			if(b) {
				return false;
			}
			repository.save(m);
			return true;
		}
		
		
		public Object find(Long id) {
			Optional<Movie> o = repository.findById(id);	//optional- eliminates null pointer exception
			if(o.isPresent()) {
				return o.get();		//returns the movie object
			}
			return null;
		}
		
		
		public boolean delete(Long id) {
			if(repository.existsById(id)) {
				repository.deleteById(id);
				return true;
			}
			return false;
		}
		
		
		public boolean update(Movie m) {
			Optional o = repository.findById(m.getMovieId());
			if(o.isPresent()) {
				repository.save(m);
				return true;
			}
			return false;
		}
}
