package com.panache.elearning.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Students{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STU_ID")
	private int stuId;
	
	@Column(name="STU_NAME")
	private String stuName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="US_ID")
	private Users user;
	
	public Students() {
		super();
	}

	public Students(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
}
