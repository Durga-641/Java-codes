package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("file1.txt");
		
		if(file.createNewFile()) {
			System.out.println("file created");
		}
		
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hey Hi pavani , how are you???");
		pw.println("this is auto email");
		pw.println("Regards Pavani");
		pw.close();
		
		System.out.println("Thanks");
		
		
	}
}
