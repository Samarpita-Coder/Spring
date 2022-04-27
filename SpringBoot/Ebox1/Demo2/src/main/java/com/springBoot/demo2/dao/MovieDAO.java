package com.springBoot.demo2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springBoot.demo2.model.Movie;

@Repository
public class MovieDAO {
	
	List<Movie> list = new ArrayList<>();
	
	public MovieDAO() {
		
		this.load();
	}

	public void load() {
		Movie m1 = new Movie(100L, "Shakuntala Devi", "Vidya Balan", "biography", 200000.0);
		this.list.add(m1);
		Movie m2 = new Movie(101L, "Inception", "Leonardo di Caprio", "sci-fi", 300000.0);
		this.list.add(m2);
		Movie m3 = new Movie(102L, "RRR", "Ram Charan", "action", 300000.0);
		this.list.add(m3);
		Movie m4 = new Movie(103L, "Nayakan", "Kamal Hassan", "biography", 400000.0);
		this.list.add(m4);
		Movie m5 = new Movie(104L, "James", "Puneet Rajkumar", "action", 500000.0);
		this.list.add(m5);
	}
	
	public List<Movie> findAll(){
		return this.list;
	}
	
	public boolean insert(Movie m) {
		this.list.add(m);
		return true;
	}
	
	public Movie find(Long id) {
		boolean found = false;
		
		for(int i=0; i<list.size(); i++) {
			Movie temp = list.get(i);
			if(temp.getMovieId().longValue()==id.longValue()) {
				found=true;
				return temp;
			}
		}if(!found) {
			return null;
		}
		return null;
	}
	
	public boolean delete(Long id) {
		boolean found = false;
		
		for(int i=0; i<list.size(); i++) {
			Movie temp = list.get(i);
			if(temp.getMovieId().longValue()==id.longValue()) {
				found=true;
				this.list.remove(i);
			}
		}if(!found) {
			return false;
		}
		return true;
	}
	
	public boolean update(Movie m) {
		
		boolean found = false;
		
		for(int i=0; i<list.size(); i++) {
			Movie temp = list.get(i);
			if(temp.getMovieId().longValue()==m.getMovieId().longValue()) {
				found=true;
				this.list.set(i,m);
			}
		}if(!found) {
			return false;
		}
		return true;
	}
	
}
