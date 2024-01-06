package com.practice.decorator;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponsDecorator {

	private Product product;
	private static List<ProductType> eligibleProductTypes;
	private int discountPercentage;
	private ProductType type;
	
	public TypeCouponDecorator(Product product, int discount, ProductType type) {
		this.product = product;
		this.discountPercentage = discount;
		this.type = type;
	}
	
	static {
		eligibleProductTypes = new ArrayList<>();
		eligibleProductTypes.add(ProductType.ELECTRONICS);
	}
	
	@Override
	public double getPrice() {
		double price = product.getPrice();
		if(eligibleProductTypes.contains(this.type)) {
			price = price - (price * discountPercentage/100);
		}
		return price;
	}

}
