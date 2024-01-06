package com.practice.decorator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	
	public ShoppingCart() {
		productList = new ArrayList<>();
	}

	public void addToCart(Product product) {
		//before adding the product into cart, decorate it.
		Product product1 = new TypeCouponDecorator(new PercentageCouponDecorator(product, 10), 5, product.getType());
		productList.add(product1);
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		for (Product product : productList) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}
}
