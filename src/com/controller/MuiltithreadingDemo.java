package com.controller;

import com.service.ThreadService;

public class MuiltithreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		Thread t1= new Thread(new ThreadUtil(),"T-1");
		t1.start();
		
		Thread t2= new Thread(new ThreadUtil2(),"T-2");
		t2.start();
		
		Thread t3= new Thread(new ThreadUtil3(),"T-3");
		t3.start();
		
		Thread t4= new Thread(new ThreadUtil4(),"T-4");
		t4.start();
		
		
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println(Thread.currentThread().getName());
		System.out.println("thankyou!!!");
	}

}


class ThreadUtil extends Thread{
	
	@Override
	public void run() {
		ThreadService.display(4);
	}
	
}

class ThreadUtil2 extends Thread{
	
	@Override
	public void run() {
		ThreadService.countsum(10);
	}
	
}

class ThreadUtil3 extends Thread{
	
	@Override
	public void run() {
		ThreadService.dis(10,500);
	}
	
}


class ThreadUtil4 extends Thread{
	
	@Override
	public void run() {
		ThreadService.dis(10,300);
	}
	
}

