

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
		
		System.out.println("Enter the username and password");
		
		String un = sc.nextLine();
		String pwd = sc.nextLine();
		
		if(un=="${db.username}" && pwd=="${db.password}") {
			String status = "yes";
			do {
				
				System.out.println("Select from the option");
				System.out.println("1) List the owners");
				System.out.println("2) update the owner detail");
				System.out.println("3) delete owner");
				System.out.println("4) Exit");
				
				int inp = Integer.parseInt(sc.nextLine());
				
				if(inp==1) {
					System.out.println("... Owner List ...");
					List<Owner> list = ownerDao.getAllOwners();
					System.out.printf("%-15s %-15s %-15s %s\n","Id","Name","Email","Mobile");
					//int n = 1;
					for(Owner x: list) {
						String i1=Integer.toString(x.getId());
						System.out.printf("%-15s %-15s %-15s %s\n",i1,x.getName(),x.getEmailId(),x.getMobileNumber());
						//n=n+1;
					}
				}else if(inp==2) {
					System.out.println("Enter the id you want to update");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("Enter the id you want to update");
					String mn = sc.nextLine();
					String em = sc.nextLine();
					ownerDao.update(id, mn, em);
					System.out.println("updated successfully");
					
				}else if(inp==3) {
					System.out.println("Enter the id of the person you want to delete");
					int id2 = Integer.parseInt(sc.nextLine());
					ownerDao.deleteOwner(id2);
					
				}else if(inp==4) {
					status="no";
					System.out.println("Thank you");
				}else {
					System.out.println("Invalid choice");
				}
				
			}while(status=="yes");
		
		}else {
			System.out.println("Unauthorized access");
		}

    }
}