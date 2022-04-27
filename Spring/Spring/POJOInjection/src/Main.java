import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sm.holiday.Holiday;
import com.sm.holiday.HolidayList;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Holiday h1 = (Holiday)context.getBean("holidayBean1");
		Holiday h2 = (Holiday)context.getBean("holidayBean2");
		
		//what r we retrieving here??
		HolidayList hList = (HolidayList)context.getBean("Holidays");
		//then, what r we inserting here??
		hList.insert(h1);
		hList.insert(h2);
		
		List<String> list = hList.getStatus();
		
		for(String x : list) {
			System.out.println(x);
		}
		

	}

}
