package com.shopping.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.shopping.app.exception.OrderException;

public class OrderService {
	
	public static List<String> getOrder() {
		
		List<String> inputList = new ArrayList<>();
	try {
		
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter the fruits list ");
		String input = scanner.nextLine();
		String fruits[] = input.split(" ");
		inputList = new ArrayList<String>();
		inputList = Arrays.asList(fruits);
		System.out.println(inputList);
		
		if(inputList.size()==0) {
			throw new OrderException("Order is not completed");
		}
	
	} catch (OrderException e) {
		System.out.println("User is notified");
	}
	return inputList;
	}
	
	public static void main(String args[]) {
		
	List<String> list = OrderService.getOrder();
	double totalPurchase = CalculateOrder.calcOrder(list);
	System.out.println("total Purchase Amount " + totalPurchase);
	
	}

	
	
}
