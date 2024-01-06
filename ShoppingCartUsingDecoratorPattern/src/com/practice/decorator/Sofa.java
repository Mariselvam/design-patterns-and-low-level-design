package com.practice.decorator;

public class Sofa extends Product {


	public Sofa(String name, double price, ProductType type) {
		super(name, price, type);
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
