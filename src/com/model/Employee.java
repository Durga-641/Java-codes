package com.model;

public class Employee extends BaseEntity implements Comparable<Employee>{
	

	private String name;
	private String city;
	private String department;
	private Double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(long id,String name, String city, String department, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", department=" + department + ", salary=" + salary
				+ ", id=" + id + "]";
	}
	@Override
	public int compareTo(Employee e2) {
		// TODO Auto-generated method stub
		
		return (int)(this.salary-e2.salary);
	}
	
	
	
	
	
	
	
	

}
