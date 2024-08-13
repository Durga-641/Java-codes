package com.controller;

import java.util.List;
import java.util.Scanner;

import com.Exception.ResourceNotFoundexception;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.getAll();
		while(true) {
			System.out.println("1.Employee List");
			System.out.println("2.Fetch Emp by id ");
			System.out.println("3.Fetch Emp by Stream");
			System.out.println("4.Fetch by steam and orElse");
			System.out.println("5.Sort Employee as per Salary: ASC comparable");
			System.out.println("6.Sort Employee as per Salary: DESC compartor");
			System.out.println("7.Sort Employee as per Salary: stream");
			System.out.println("8.delete Employee using stream");
			System.out.println("0.Exit");
			int input = sc.nextInt();
			if(input ==0) {
				System.out.println("Existing....");
				break;
			}
			switch(input) {
			case 1:
				
				System.out.println("------------ALL Employess------");
				list.stream().forEach(System.out::println);
				break;
			case 2:
				System.out.println("----Fetch Employee by Id-----");
				System.out.println("Enter Employee id to fetch record: ");
				
				Long id = sc.nextLong();
				try {
					Employee e = employeeService.getById(list, id);
					 System.out.println(e);
				} catch (ResourceNotFoundexception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					//e1.printStackTrace();
				}
				break;
			case 3:
				System.out.println("===Fetch Employee by id using streams====");
				System.out.println("Enter emp id to fetch record: ");
				id = sc.nextLong();
				
				try {
					Employee e = employeeService.getByIdStream(list, id);
					 System.out.println(e);
				} catch (ResourceNotFoundexception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					//e1.printStackTrace();
				}
				break;
			case 4:
				System.out.println("===Fetch Employee by id using streams and orElse====");
				System.out.println("Enter emp id to fetch record: ");
				id = sc.nextLong();
				
				try {
					Employee e = employeeService.getByIdStream2(list, id);
					 System.out.println(e);
				} catch (ResourceNotFoundexception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					//e1.printStackTrace();
				}
				break;
			case 5:
				list = employeeService.getEmployeesinsortedOrder(list, "ASC");
				list.stream().forEach(System.out::println);
				
				break;
			case 6:
				list = employeeService.getEmployeeInSortedOrderOfSalaryComparator(list, "ASC");
				list.stream().forEach(System.out::println);
				break;
			case 7:
				list = employeeService.getEmployeeInSortedOrderOfSalaryUsingStream(list);
				list.stream().forEach(System.out::println);
				break;
			case 8:
				id = sc.nextLong();
				try {
					list = employeeService.deleteOne(list,id);
					list.stream().forEach(System.out::println);
				} catch (ResourceNotFoundexception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
					
				
				break;
			default:
				System.out.println("Enter valid  option.. Try Again ");
				break;
			}
		}
	}
}
