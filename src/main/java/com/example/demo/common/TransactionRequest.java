package com.example.demo.common;

import com.example.demo.entity.Order;

public class TransactionRequest {
	
	
	
	private Order order;
	private Payment payment;
	
	
	
	public TransactionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	

}
