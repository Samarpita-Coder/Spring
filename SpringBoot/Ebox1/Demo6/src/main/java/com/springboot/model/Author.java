package com.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="AUTHOR")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AUTHOR_ID")
	private Long id;
	
	@Column(name="AUTHOR_NAME")
	private String authorName;
	
	@OneToMany(targetEntity=Book.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Book> books;

	public Author() {
		super();
	}

	public Author(String authorName, List<Book> books) {
		super();
		this.authorName = authorName;
		this.books = books;
	}

	public Author(Long id, String authorName, List<Book> books) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@JsonManagedReference
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
