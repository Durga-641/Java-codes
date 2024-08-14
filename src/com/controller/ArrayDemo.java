package com.controller;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };// giving values directly

		int[] y = new int[10];// values come from db
		for (int i = 0; i < y.length; i++) {
			y[i] = i + 1;
		}
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println("\n----------");
		int[] z = new int[] { 9, 5, 3, 6, 3, 4, 5 };
		for (int temp : z) {

			System.out.print(temp + " ");

		}
		System.out.println("\n----------");

		Arrays.sort(z);
		System.out.println("sorted arrays");
		for (int temp : z) {

			System.out.print(temp + " ");

		}
		System.out.println("\n----------");
		System.out.println(Arrays.binarySearch(z, 6)>0?"found":"not found");
		
		System.out.println(Arrays.binarySearch(z, 2)>0?"found":"not found");
	}
}
