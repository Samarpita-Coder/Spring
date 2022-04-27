import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sm.holiday.Holiday;
public class Main {
    public static void main(String[] args) {
          ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
          Holiday holiday = (Holiday) ctx.getBean("holidayBean");
          //System.out.println(holiday.getCity());
          holiday.display();
    }
}