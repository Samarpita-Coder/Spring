package com.sm.holiday;

import java.util.ArrayList;
import java.util.List;

public class HolidayList {

	private List<Holiday> holidayList = new ArrayList<Holiday>();
	
	public void insert(Holiday holiday) {
		holidayList.add(holiday);
	}
	
	public List<String> getStatus(){
		List<String> list = new ArrayList<>();
		String status = null;
		for(Holiday h: this.holidayList) {
			if(h.getFare()>1500000) {
				status = h.getName()+" went on expensive holiday";
			}
			else {
				status = h.getName()+" went on economical holiday";
			}
			list.add(status);
		}
		return list;
	}
}
