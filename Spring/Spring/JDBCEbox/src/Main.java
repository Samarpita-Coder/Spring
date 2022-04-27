

import com.spring.entity.*;

import com.spring.dao.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
    	Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		OwnerDAO ownerDao = (OwnerDAO)ctx.getBean("ownerDAO");
		
		List<Owner> list = ownerDao.getAllOwners();
		for(Owner x: list) {
			System.out.println(x.getName());
		}
		
		System.out.println("Enter the name of the person you want to search");
		
		
		String name= sc.nextLine();
		
		String mn = ownerDao.getOwnerNumberByName(name);
		
		if(mn!=null) {
			System.out.println("You can contact "+name+" by "+mn);
		}else {
			System.out.println("No such owner!");
		}
		
		
		
	}

}
