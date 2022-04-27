package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

//import com.springBoot.demo2.model.Movie;
import com.springboot.domain.Doctor;

@Component
public class DoctorDAO {

    List<Doctor> doctorList = new ArrayList<Doctor>();

	public DoctorDAO() {
		this.load();
	}

	public void load() {
		doctorList.add(new Doctor(1L, "Clay", "clay@gmail.com", 1200.0, "Wednesday", "MBBS"));
		doctorList.add(new Doctor(2L, "Hannah", "hannah@gmail.com", 2400.0, "Friday", "BDS"));
		doctorList.add(new Doctor(3L, "Jim", "jim@gmail.com", 3400.0, "Monday", "MBBS,MD"));
		doctorList.add(new Doctor(4L, "Hopper", "hopper@gmail.com", 7500.0, "Tuesday", "MBBS,MD"));
		//return doctorList;
	}

	public List<Doctor> list() {
		return this.doctorList;
	}

	public Doctor get(Long id) {
		boolean found = false;
		
		for(int i=0; i<doctorList.size(); i++) {
			Doctor temp = doctorList.get(i);
			if(temp.getId().longValue()==id.longValue()){
				found=true;
				return temp;
			}
		}if(!found) {
			return null;
		}
		return null;
	}

	public Doctor create(Doctor doc) {
		doctorList.add(doc);
		return doc;
	}

	public Boolean update(Doctor doctor) {

		boolean found = false;
		
		for(int i=0; i<doctorList.size(); i++) {
			Doctor temp = doctorList.get(i);
			if(temp.getId().longValue()==doctor.getId().longValue()) {
				found=true;
				this.doctorList.set(i,doctor);
			}
		}if(!found) {
			return false;
		}
		return true;
	}

	public Boolean delete(Long id) {
		boolean found = false;
		
		for(int i=0; i<doctorList.size(); i++) {
			Doctor temp = doctorList.get(i);
			if(temp.getId().longValue()==id.longValue()){
				found=true;
				doctorList.remove(i);
				//return true;
			}
		}if(!found) {
			return false;
		}
		return true;
	}
}
