package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.common.Payment;
import com.example.demo.common.TransactionRequest;
import com.example.demo.common.TransactionResponce;
import com.example.demo.entity.Order;
import com.example.demo.repository.OrderReporsitory;

@Service
public class OrderService {
	
	@Autowired
	private OrderReporsitory orderrepo;
	
	@Autowired
	private RestTemplate resttemplate;
	
	
	public TransactionResponce saveOrder(TransactionRequest request) {
		
		String responsemessage="";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderid(order.getId());
		payment.setAmount(order.getPrice());
	
		Payment paymentresponse=resttemplate.postForObject("http://localhost:1000/payments/dopayment", payment, Payment.class);
		
		
		responsemessage=paymentresponse.getPayemntStatus().equals("success")?"SUCCESS":"REJECTED";
		
		orderrepo.save(order);
		return new TransactionResponce(order,paymentresponse.getAmount(),paymentresponse.getTransactionId(),responsemessage);
	}

}
