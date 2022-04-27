

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
		
		System.out.println("... Owner List ...");
		List<Owner> list = ownerDao.getAllOwners();
		System.out.printf("%-15s %-15s %-15s %s\n","Id","Name","Email","Mobile");
		//int n = 1;
		for(Owner x: list) {
			String i1=Integer.toString(x.getId());
			System.out.printf("%-15s %-15s %-15s %s\n",i1,x.getName(),x.getEmailId(),x.getMobileNumber());
			//n=n+1;
		}
		
		System.out.println("Enter the id of the person you want to delete");
		
		
		int id= Integer.parseInt(sc.nextLine());
		
		String ow = ownerDao.getOwnerById(id);
		
		if(ow!=null) {
			ownerDao.delete(id);
			System.out.println("owner deleted successfully");
			System.out.println("... Updated owner List ...");
			List<Owner> list2 = ownerDao.getAllOwners();
			System.out.printf("%-15s %-15s %-15s %s\n","Id","Name","Email","Mobile");
			//int n2 = 1;
			for(Owner x2: list2) {
				String i2=Integer.toString(x2.getId());
				System.out.printf("%-15s %-15s %-15s %s\n",i2,x2.getName(),x2.getEmailId(),x2.getMobileNumber());
				//n2=n2+1;
			}
		}else {
			System.out.println("No such owner");
		}
		
		
		
		
		
	}

}
