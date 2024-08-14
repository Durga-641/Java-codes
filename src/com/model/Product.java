package com.model;

public class Product implements Comparable<Product> {
	
	private int id;
	private String title;
	private String description;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product p2) {
		// TODO Auto-generated method stub
		return (int)(this.price-p2.price);
	}
	
	

}
