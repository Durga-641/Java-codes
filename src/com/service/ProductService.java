package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductService {
	
	public List<Product> getAllProducts(){
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.setId(1);
		p1.setTitle("apple");
		p1.setDescription("good for health");
		p1.setPrice(100);
		
		p2.setId(2);
		p2.setTitle("watermelon");
		p2.setDescription("good for wter content");
		p2.setPrice(80);
		
		p3.setId(3);
		p3.setTitle("Pineapple");
		p3.setDescription("good for body");
		p3.setPrice(50);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		return list;
	}

}
