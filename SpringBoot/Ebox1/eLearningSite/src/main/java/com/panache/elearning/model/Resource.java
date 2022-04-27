package com.panache.elearning.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

//--------------------------------------------------------------------------------------------

@Entity
@Table(name="RESOURCES")
public class Resource {

	@Id
	//@GeneratedValue(generator="RESOURCES_SEQ")
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="RESOURCES_SEQ",sequenceName="RESOURCES_SEQ", allocationSize=1)
	@Column(name="RESOURCE_ID")
	private Integer resId;				//primary key
	
	@ManyToOne(targetEntity=Student.class)
	//@JoinColumn(name="STUDENT_ID")		//foreign key here (mapped to student table)
	private Student student;
	
	
	@Column(name="RESOURCE_NAME")
	private String resName;

//-------------------------------------------------------------------------------------------------
	

	public Resource() {
		super();
	}
	
	public Resource(Integer resId, String resName) {
		super();
		this.resId = resId;
		this.resName = resName;
	}


	public Resource(Integer resId, Student student, String resName) {
		super();
		this.resId = resId;
		this.student = student;
		this.resName = resName;
	}


//-----------------------------------------------------------------------------------------------
	
	
	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public Student getStudent() {
		return student;
	}
	
	@JsonBackReference
	public void setStudent(Student student) {
		this.student = student;
	}

	public String getRes_name() {
		return resName;
	}

	public void setRes_name(String resName) {
		this.resName = resName;
	}
	
}
