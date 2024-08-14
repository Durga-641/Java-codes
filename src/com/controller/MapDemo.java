package com.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("pavani", "durga");
		map.put("lucky", "dogga");
		map.put("vinayka", "d");
		System.out.println("Enter the name : ");
		String name = sc.next();
		boolean isLogin=false;
		for( String key : map.keySet()) {
			if(key.equals(name)) {
				System.out.println("Please enter password : ");
				String password = sc.next();
				String value= map.get(name);
				if(password.equals(value)) {
					System.out.println("Welcome "+ name);
					System.out.println("Login sucess!");
					isLogin=true;
					break;
				}
				else {
					System.out.println("Password incorrect , Login denied" );
					break;
			
				}
			}
		}
			if(isLogin==false) {
				System.out.println("name is incorrect, Login denied");
			}
			
		}
}

