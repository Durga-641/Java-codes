package com.controller;

import com.model.Customer;
import com.service.CustomerService;

public class App {
	public static void main(String[] args) {
		//System.out.println("Hello world!");
		Customer c1=new Customer(1,"pavani","hyd",5000);
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("durga");
		c2.setCity("vskp");
		c2.setBalance(8754);
		
		System.out.println(c1.getBalance());
		System.out.println(c2.getBalance());
		CustomerService cs = new CustomerService();
		cs.deposit(c1,5000);
		System.out.println(c1.getBalance());
		
		cs.deposit(c2,5000);
		System.out.println(c2.getBalance());
		
		
	}

}
