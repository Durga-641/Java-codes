package com.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Exception.ResourceNotFoundexception;
import com.model.Employee;

public interface EmployeeRepository extends BaseRepository{
	
	public default List<Employee> getAll() {
		Employee e1 = new Employee(1L, "pavani", "vizag", "IT", 40000);
		Employee e2 = new Employee(2L, "durga", "hyd", "Admin", 45000);
		Employee e3 = new Employee(3L, "dogga", "vzw", "Telecom", 50000);
		Employee e4 = new Employee(4L, "lucky", "UK", "Tech", 55000);
		Employee e5 = new Employee(5L, "vasu", "Usa", "AI", 60000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e5);
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e1);
		return list;
	}
	
	public default Employee getById(List<Employee> list, long id) throws ResourceNotFoundexception {
		for(Employee e:list) {
			if(e.getId()==id) {
				return e;
			}
		}
		throw new ResourceNotFoundexception("Invalid ID");
		
	}
	
	public default Employee getByIdStream(List<Employee> list, long id) throws ResourceNotFoundexception {
		list = list.stream()
		.filter(e->e.getId()==id)
		.collect(Collectors.toList());
		if(list.size()==0) {
			throw new ResourceNotFoundexception("Invalid ID");
		}
		 return list.get(0);
		
	}
	
	public default Employee getByIdStream2(List<Employee> list, long id) throws ResourceNotFoundexception {
		Employee emp = list.stream()
		.filter(e->e.getId()==id)
		.findAny().orElse(null);
		if(emp==null) {
			throw new ResourceNotFoundexception("Invalid ID");
		}
		 return emp;	
	}
	
	public default List<Employee> deleteOne(List<Employee> list, long id) throws ResourceNotFoundexception {
	    List<Employee> updatedList = list.stream()
	        .filter(e -> e.getId() != id)
	        .collect(Collectors.toList());

	    if (updatedList.size() == list.size()) {
	        throw new ResourceNotFoundexception("Invalid ID");
	    }

	    list.clear();
	    list.addAll(updatedList);
	    return list;
	}

}
