package com.service;

import com.model.Customer;

public class CustomerService {

	public void deposit(Customer c1, int i) {
		// TODO Auto-generated method stub
		double temp = c1.getBalance()+i;
		c1.setBalance(temp);
		
	}

}
