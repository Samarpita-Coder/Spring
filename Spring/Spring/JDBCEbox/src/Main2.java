
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Package Details:");
		StandardPackage sp = (StandardPackage) ctx.getBean("package1");
		System.out.println("Package-1");
		sp.calculateCost();
		sp.display();
		System.out.println("Package-2");
		StandardPackage sp2 = (StandardPackage) ctx.getBean("package2");
		s2.calculateCost();
		sp2.display();
		System.out.println("Package-3");
		StandardPackage sp3 = (StandardPackage) ctx.getBean("package3");
		sp3.calculateCost();
		sp3.display();
		
		

        
	}

}