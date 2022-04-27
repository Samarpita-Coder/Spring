package com.panache.elearning.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//---------------------------------------------------------------------------------------------

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @SequenceGenerator(name="STUDENT_SEQ",sequenceName="STUDENT_SEQ",
	// allocationSize=1)
	@Column(name = "STUDENT_ID")
	private Integer stuId; // primary key

	@Column(name = "STUDENT_NAME")
	private String stuName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NUMBER")
	private Long pnum;

	@Column(name = "USERNAME")
	private String uname;

	@Column(name = "PASSWORD")
	private String pwd;

	//cascade=CascadeType.ALL- whenever we save Student record, all the resources are saved in the Resource table too.
	
	
	@OneToMany(targetEntity = Resource.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Resource> resources; // mapped to Resource table

//-------------------------------------------------------------------------------------------

	public Student() {
		super();
	}

	public Student(String stuName, String email, Long pnum, String uname, String pwd) {
		super();
		this.stuName = stuName;
		this.email = email;
		this.pnum = pnum;
		this.uname = uname;
		this.pwd = pwd;
	}

	public Student(String stuName, String email, Long pnum, String uname, String pwd, List<Resource> resources) {
		super();
		this.stuName = stuName;
		this.email = email;
		this.pnum = pnum;
		this.uname = uname;
		this.pwd = pwd;
		this.resources = resources;
	}

//-------------------------------------------------------------------------------------------------------------------

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPnum() {
		return pnum;
	}

	public void setPnum(Long pnum) {
		this.pnum = pnum;
	}
	
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@JsonManagedReference
	public List<Resource> getResource() {
		return resources;
	}

	public void setResource(List<Resource> resources) {
		this.resources = resources;
	}

//----------------------------------------------------------------------------------------

}
