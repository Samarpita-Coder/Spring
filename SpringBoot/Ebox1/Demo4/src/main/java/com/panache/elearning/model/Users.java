package com.panache.elearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="US_ID")
	private int userId;
	
	@Column(name="UNAME")
	private String username;
	
	@Column(name="PWD")
	private String pwd;
	
	@OneToOne(mappedBy="user")
	private Students student;
	public Users() {
		super();
	}
	public Users(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public Users(int userId, String username, String pwd) {
		super();
		this.userId = userId;
		this.username = username;
		this.pwd = pwd;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	
	
	
}
