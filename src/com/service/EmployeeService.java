package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeService {
	
	public List<Employee> getAllEmployees(){
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setId(1);
		e1.setName("pavani");
		e1.setCity("Hyd");
		e1.setDepartment("Telecom");
		e1.setSalary(40000);
		
		e2.setId(2);
		e2.setName("durga");
		e2.setCity("Hyderabad");
		e2.setDepartment("IT");
		e2.setSalary(45000);
		
		e3.setId(3);
		e3.setName("priya");
		e3.setCity("Chennai");
		e3.setDepartment("Telecom");
		e3.setSalary(55000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		return list;
	}

}
