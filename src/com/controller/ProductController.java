package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.model.Product;
import com.service.ProductService;

public class ProductController {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(2);
		set.add(6);
		set.add(1);
		set.add(6);
		//set.add(null);
		System.out.println(set);
		
		List<Integer> lis = new ArrayList<>();
		lis.add(3);
		lis.add(2);
		lis.add(6);
		lis.add(1);
		lis.add(6);
		lis.add(null);
		
		lis.stream().filter(e->e!=null).distinct().collect(Collectors.toList());
		System.out.println(lis);
		ProductService productService = new ProductService();
		List<Product> list = productService.getAllProducts();
		//System.out.println(list);
		list.stream().forEach(System.out::println);
		System.out.println("----------Set--------------");
		Set<Product> setprod=new TreeSet<>(list);
		setprod.stream().forEach(System.out::println);
//		for(Product p : list) {
//			System.out.println(p.getId()+"--"+p.getTitle()+"--"+p.getPrice());
//			
//		}
//		
//		System.out.println("-----------break------------------------");
//		list =list.stream().filter(p->p.getPrice()>=60).collect(Collectors.toList());
//		for(Product p : list) {
//			System.out.println(p.getId()+"--"+p.getTitle()+"--"+p.getPrice());
//			
//		}
	}
}
