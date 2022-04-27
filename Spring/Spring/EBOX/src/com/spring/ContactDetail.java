package com.spring;

import java.util.ArrayList;
import java.util.List;

public class ContactDetail {
	
	String email;
	Address address;
	List<String> contactNumbers = new ArrayList<>();
	
	
	
	public String getEmail() {
		return email;
	}
	public List<String> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(List<String> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("The contact numbers are ");
		for(String x:contactNumbers) {
			System.out.println(x);
		}
		System.out.println("email :"+this.email);
		this.address.display();

	}

}
