package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.springboot.domain.Employee;

@Component
public class EmployeeDAO {

	List<Employee> employeeList = new ArrayList<Employee>();
    
    public EmployeeDAO(){
        this.load();
    }
    
	  public void load(){
		employeeList.add(new Employee(1L,"Elizabeth","elizabeth@gmail.com",4.2,"7845128956"));
		employeeList.add(new Employee(2L,"Michael","michael@gmail.com",2.0,"7441855296"));
		employeeList.add(new Employee(3L,"Charlotte","charlotte@gmail.com",3.1,"9663855274"));
		employeeList.add(new Employee(4L,"Lucas","lucas@gmail.com",1.9,"8956231245"));
	  }
	
	

	public Boolean save(Employee employee) {
		this.employeeList.add(employee);
        return true;
	}


	public List<Employee> list() {
		return this.employeeList;
	}
	
}
