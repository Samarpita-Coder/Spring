package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BOOK_ID")
	private Long id;
	
	@Column(name="BOOK_NAME")
	private String bname;
	
	@ManyToOne(targetEntity=Author.class)
	private Author author;

	public Book() {
		super();
	}

	public Book(String bname, Author author) {
		super();
		this.bname = bname;
		this.author = author;
	}

	public Book(Long id, String bname, Author author) {
		super();
		this.id = id;
		this.bname = bname;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	
	@JsonBackReference
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
