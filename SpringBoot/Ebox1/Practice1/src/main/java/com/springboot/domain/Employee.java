package com.springboot.domain;

public class Employee {
	
	private Long id;
	private String name;
	private String email;
	private Double experience;
	private String mobilenumber;

        public Employee(){
        }
		
	public Employee(Long id, String name, String email,
			Double experience, String mobilenumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.mobilenumber = mobilenumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}

