package com.practice.decorator;

public class MobilePhone extends Product {

	public MobilePhone(String name, double price, ProductType type) {
		super(name, price, type);
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
