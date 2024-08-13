package com.controller;

public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "harry";
		String s2 = "pavani";
		String obj = new String("harry");
		
		System.out.println(s1);
		System.out.println(obj);
		s1="harry potter";
		System.out.println(s1);
		s1="harry";
		System.out.println(s1);
		System.out.println(s1==obj);
		System.out.println(s1.equals(obj));
		
		System.out.println(s1.toUpperCase());
		s1 = s1.concat(" potter");
		System.out.println(s1);
		
		String[] sArra=s1.split(" ");
		String fname = sArra[0];
		String lname = sArra[1];
		System.out.println(fname);
		System.out.println(lname);
		
		String email = "pavani@gmail.com";
		System.out.println(email);
		System.out.println("Welcome "+email.split("@")[0]);
		
		
	}

}
