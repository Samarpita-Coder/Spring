package com.springboot.domain;

public class Book {
	private Long id;
	private String name;
	private String subject;
	private String publisher;
	private String author;
	
	public Book() {
		
	}

	public Book(Long id, String name, String subject, String publisher, String author) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.publisher = publisher;
		this.author = author;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPublisher() {
		return publisher;
	}
	public void getPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
