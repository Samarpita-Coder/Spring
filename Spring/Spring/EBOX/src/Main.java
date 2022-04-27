import com.spring.*;
import com.spring.TicketBooking;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		Scanner sc = new Scanner(System.in);
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketBooking tb = (TicketBooking)ctx.getBean("TicketBooking");
		
		System.out.println("Enter the number of Senior Citizens");
		int sen = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the number of Ex Service Men");
		int ser = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the number of Infants below 2 years");
		int inf = Integer.parseInt(sc.nextLine());
		
		tb.faregenerator(sen,ser,inf);
		
		
		
		
		
		
		
		
	}

}
