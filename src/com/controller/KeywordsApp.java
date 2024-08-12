package com.controller;

import com.model.BaseEntity;
import com.model.Student;

public class KeywordsApp {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"pavani","vizag");
		System.out.println(s1.getcName());
		
		//BaseEntity entity = new BaseEntity();
		//entity.id = 45;
		//entity.setId(34);
		s1.doTask();
		System.out.println(s1);
		
		
	}

}
