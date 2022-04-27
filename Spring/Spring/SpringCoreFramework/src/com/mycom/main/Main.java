package com.mycom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.vehicle.Tyre;
import com.mycom.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle)ctx.getBean("car");
		obj.ride();
//		Tyre ob = (Tyre)ctx.getBean("tyre");
//		System.out.println(ob);

	}

}
