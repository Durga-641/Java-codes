package com.controller;

import com.Exception.PercentageGradeException;
import com.service.MarksService;

public class MarksController {
	public static void main(String[] args) {
		MarksService ms = new MarksService();
		double marks_scored=170;
		double total_marks=300;
		
		try {
			String Grade = ms.compute(marks_scored,total_marks);
			System.out.println("your Grade :"+Grade);
		} catch (PercentageGradeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
