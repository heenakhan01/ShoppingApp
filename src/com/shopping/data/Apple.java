package com.shopping.data;

public class Apple implements Fruit{

	private double price = 0.0;
	public int quantity =0;
	
	@Override
	public double getPrice() {
		this.price=0.60;
		return this.price;
	}
	
}
