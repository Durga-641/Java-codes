package com.controller;

import com.Exception.DivideByZeroException;
import com.Exception.InvalidInputException;

public class ExceptionDemo {
	public static void main(String[] args) {
		A a = new A();
		a.doTask();
		int res;
		try {
			res = a .compute(12, 14);
			System.out.println("Result :"+res);
		} catch (DivideByZeroException | InvalidInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		
		System.out.println("thankyou");
		
	}

}

class A{
	void doTask(){
		System.out.println("task done");
	}
	
	public int compute (int i,int j ) throws DivideByZeroException, InvalidInputException {
		
		if(j==0) {
			throw new DivideByZeroException("divide by zero is not allowed");
		}
		if(j<0) {
			throw new InvalidInputException("deno cannot be less than Zero");
		}
		if (j>i) {
			throw new InvalidInputException("j shoule be less than i");
		}
		return i/j;
	}
}




