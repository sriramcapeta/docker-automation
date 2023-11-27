package com.example.demo.common;





public class Payment {
	
	
	private int paymentId;
	private String payemntStatus;
	private String transactionId;
	private int orderid;
	private double amount;
	
	public Payment() {
		
	}
	
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPayemntStatus() {
		return payemntStatus;
	}
	public void setPayemntStatus(String payemntStatus) {
		this.payemntStatus = payemntStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}



	public int getOrderid() {
		return orderid;
	}



	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
