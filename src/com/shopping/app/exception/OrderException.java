package com.shopping.app.exception;

public class OrderException extends Exception {
    String message;
	
    public OrderException(String message){
    	this.message = message;
    }
    
    public String orderException() {
    	return "Order status: ";
    }
}
