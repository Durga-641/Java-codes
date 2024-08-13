package com.controller;

public class StringDemo {
	public static void main(String[] args) {
		try {
		String s= "100";
		//string to Integer
		int n = Integer.parseInt(s);
		System.out.println(n);
		
		//String to double
		double val = Double.parseDouble(s);
		System.out.println(val);
		
		//String to float
		double flo = Float.parseFloat(s+"a");
		System.out.println(flo);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thankyou");
	}

}
