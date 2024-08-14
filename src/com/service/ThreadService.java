package com.service;

public class ThreadService {
	static int count=0;
	public static void display(int n) {
		System.out.println("Excuted by : "+Thread.currentThread().getName());
		for(int i=0;i<n;i++) {
			System.out.print(i+"-");
		}
	}
	
	public static void countsum(int num) {
		System.out.println("Excuted by : "+Thread.currentThread().getName());
		int s=0;
		for(int i=1;i<=num;i++) {
			s=s+i;
		}
		System.out.println("sum :"+s);
	}
	
	public static void dis(int start, int end) {
	
		synchronized ("") {
			for(int i=start;i<end;i++) {
				System.out.println(Thread.currentThread().getName()+"-----"+"--send email--"+"-------"+(count++));
			}
		}
		System.out.println("Excuted by : "+Thread.currentThread().getName());
		
		
	}

}
