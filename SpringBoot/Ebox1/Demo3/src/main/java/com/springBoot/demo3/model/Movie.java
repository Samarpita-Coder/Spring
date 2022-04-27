package com.springBoot.demo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie {
	
	
	//recommended to use generic classes instead of primitive
	@Id
	@Column(name="MOVIE_ID")
	private Long movieId;
	@Column(name="MOVIE_NAME")
	private String movieName;
	@Column(name="ACTOR")
	private String actor;
	@Column(name="GENRE")
	private String genre;
	@Column(name="BUDGET")
	private Double budget;
	
	public Movie() {
		super();
	}

	public Movie(Long movieId, String movieName, String actor, String genre, Double budget) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
		this.genre = genre;
		this.budget = budget;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
	
}
