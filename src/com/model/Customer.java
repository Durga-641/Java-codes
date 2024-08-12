package com.model;

public class Customer extends BaseEntity {
	
	private String name;
	private String city;
	private double balance;
	
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer(int id, String name, String city, double balance) {
		
		
		this.name = name;
		this.city = city;
		this.balance = balance;
	}
	public Customer() {
		
	}
	
	
	
	
	
	

}
