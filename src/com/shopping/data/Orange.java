package com.shopping.data;

public class Orange implements Fruit {
	
	private double price = 0.0;
	public int quantity =0;
	
	@Override
	public double getPrice() {
		this.price=0.25;
		return this.price;
	}
	
	

}
