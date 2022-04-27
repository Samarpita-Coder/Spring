package com.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicketBooking {
	
	int numberOfPersons;
	double fare;
	
	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
	
	public TicketBooking(int numberOfPersons, double fare) {
		super();
		this.numberOfPersons = numberOfPersons;
		this.fare = fare;
	}
	
	public TicketBooking() {}

	public double faregenerator(int sen, int ser, int inf)throws NumberFormatException, IOException {
		double discount = (230*sen*0.7)+(230*ser*0.5)+(230*inf*0.8);
		System.out.println("The total cost for 3 is Rs."+ discount);
	}

}
