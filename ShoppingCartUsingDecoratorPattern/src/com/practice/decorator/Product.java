package com.practice.decorator;

public abstract class Product {
	protected String name;
	protected double price;
	protected ProductType type;
	
	public Product() {
		
	}
	
	public Product(String name, double price, ProductType type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public abstract double getPrice();
	
	public ProductType getType() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}
}
