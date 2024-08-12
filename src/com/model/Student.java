package com.model;

public class Student extends College{
	
	private String name; //pavani
	private String adress;
	
	
	
	public Student(long id,String name, String adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	public Student() {
		
	}
	@Override
	public void doTask() {
		System.out.println("do task");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", cName=" + cName + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
