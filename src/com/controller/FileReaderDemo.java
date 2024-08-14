package com.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f2 = new File("file1.txt");
		FileReader reader = new FileReader(f2);
		StringBuilder mess = new StringBuilder("");
		int input;
		while((input=reader.read())!=-1) {
			mess.append((char)input);
		}
		System.out.println(mess);
		reader.close();
	}

}
