package com.springboot.domain;

public class Doctor {
	
	private Long id;
	private String name;
	private String email;
	private Double consultationFees;
	private String weekDayHoliday;
	private String qualification;
	
	public Doctor() {
		super();
	}

	public Doctor(Long id, String name, String email, Double consultationFees, String weekDayHoliday,
			String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.consultationFees = consultationFees;
		this.weekDayHoliday = weekDayHoliday;
		this.qualification = qualification;
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
	public Double getConsultationFees() {
		return consultationFees;
	}
	public void setConsultationFees(Double consultationFees) {
		this.consultationFees = consultationFees;
	}
	public String getWeekDayHoliday() {
		return weekDayHoliday;
	}
	public void setWeekDayHoliday(String weekDayHoliday) {
		this.weekDayHoliday = weekDayHoliday;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
