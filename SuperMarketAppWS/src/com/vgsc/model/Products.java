package com.vgsc.model;

public class Products {
	
	private String name ;
	private String publisher;
	private double price;
	
	public Products(String name, String publisher, float price) {
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
