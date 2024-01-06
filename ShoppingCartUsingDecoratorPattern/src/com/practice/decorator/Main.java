package com.practice.decorator;

public class Main {

	public static void main(String[] args) {
		Product mobilePhone = new MobilePhone("mobile", 2000, ProductType.ELECTRONICS);
		Product sofa = new Sofa("sofa", 1000, ProductType.FURNITURE);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(mobilePhone);
		cart.addToCart(sofa);
		
		System.out.println("Total price="+cart.getTotalPrice());
	}

}
