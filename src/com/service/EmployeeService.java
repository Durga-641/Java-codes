package com.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.model.Employee;
import com.persistence.EmployeeRepository;
import com.utility.SortUtility;

public class EmployeeService implements EmployeeRepository {
	
	public List<Employee> getEmployeesinsortedOrder(List<Employee> list, String direction) {
		  if (direction.equalsIgnoreCase("ASC")) {
	            Collections.sort(list);
	        } else if (direction.equalsIgnoreCase("DESC")) {
	            Collections.sort(list, Collections.reverseOrder());
	        }
	        return list;
	    }
	
	public List<Employee> getEmployeeInSortedOrderOfSalaryComparator(List<Employee> list, String direction){
		if(direction.equals("ASC")) {
			Collections.sort(list,new SortUtility("ASC"));
		}else {
			Collections.sort(list,new SortUtility("DESC"));
		}
		return list;
	}

	public List<Employee> getEmployeeInSortedOrderOfSalaryUsingStream(List<Employee> list) {
		// TODO Auto-generated method stub
		list = list.stream()
		.sorted((e1,e2)-> e2.getSalary().compareTo(e1.getSalary()))
		.collect(Collectors.toList());
		return list;
	}
	
	
//	public List<Employee> getAllEmployees(){
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
//		
//		e1.setId(1);
//		e1.setName("pavani");
//		e1.setCity("Hyd");
//		e1.setDepartment("Telecom");
//		e1.setSalary(40000);
//		
//		e2.setId(2);
//		e2.setName("durga");
//		e2.setCity("Hyderabad");
//		e2.setDepartment("IT");
//		e2.setSalary(45000);
//		
//		e3.setId(3);
//		e3.setName("priya");
//		e3.setCity("Chennai");
//		e3.setDepartment("Telecom");
//		e3.setSalary(55000);
//		
//		List<Employee> list = new ArrayList<>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		
//		return list;
//	}

}
