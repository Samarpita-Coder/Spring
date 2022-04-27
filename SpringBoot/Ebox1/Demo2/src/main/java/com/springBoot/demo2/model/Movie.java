package com.springBoot.demo2.model;

public class Movie {
	
	
	//recommended to use generic classes instead of primitive
	private Long movieId;
	private String movieName;
	private String actor;
	private String genre;
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
