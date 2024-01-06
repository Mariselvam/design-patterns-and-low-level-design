package com.practice.decorator;

public class PercentageCouponDecorator extends CouponsDecorator {

	private Product product;
	private int discountPercentage;
	
	public PercentageCouponDecorator(Product product, int discount) {
		this.product = product;
		this.discountPercentage = discount;
	}

	@Override
	public double getPrice() {
		double originalPrice = product.getPrice();
		double discountedPrice = originalPrice - (originalPrice * discountPercentage/100);
		return discountedPrice;
	}

}
