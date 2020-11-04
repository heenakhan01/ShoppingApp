package com.shopping.service;

import java.util.List;

import com.shopping.app.exception.OrderException;
import com.shopping.data.Apple;
import com.shopping.data.Orange;

public class CalculateOrder {

	public static double calcOrder(List<String> list) {
		double totalCost = 0.0;
		double totalAppleCost = 0.0;
		double totalOrangeCost = 0.0;
		try {
			Apple apple = new Apple();
			Orange orange = new Orange();

			for (String fruit : list) {
				if (fruit.equalsIgnoreCase("apple")) {
					apple.quantity++;

				} else if (fruit.equalsIgnoreCase("orange")) {
					orange.quantity++;

				}
			}
			CalculateOrder calc = new CalculateOrder();

			totalAppleCost = calc.getDiscountOnApple(apple);
			totalOrangeCost = calc.getDiscountOnOrange(orange);
			totalCost = totalAppleCost + totalOrangeCost;
			if (totalCost == 0.0) {
				
				throw new OrderException("Order Failed! Please try again ");
			} else {
				System.out.println("Order is completed successfully");
			}

		} catch (OrderException e) {
			System.out.println("User is notified");
		}

		return totalCost;
	}

	public double getDiscountOnApple(Apple apple) {
		double totalAppleCost = 0.0;
		if (apple.quantity == 2) {
			totalAppleCost = 0.6;
		} else {
			totalAppleCost = apple.getPrice() * apple.quantity;
		}

		return totalAppleCost;

	}

	public double getDiscountOnOrange(Orange orange) {
		double totalOrangeCost = 0.0;
		if (orange.quantity == 3) {
			totalOrangeCost = 0.5;
		} else {
			totalOrangeCost = orange.getPrice() * orange.quantity;
		}
		return totalOrangeCost;
	}

}
