package com.service;

import com.Exception.PercentageGradeException;

public class MarksService {

	public String compute(double marks_scored, double total_marks) throws PercentageGradeException {
		if(marks_scored>300) {
			throw new PercentageGradeException("marks cannot be greater then 0");
		}
		if(marks_scored<0) {
			throw new PercentageGradeException("marks cannot be negative");
		}
		if(marks_scored>total_marks){
			throw new PercentageGradeException("Invalid marks given");
		}
		
		double percent = (marks_scored/total_marks)*100;
		String grade=percent>75?"A":percent>60?"B":"C";
		return grade;
	}

}
