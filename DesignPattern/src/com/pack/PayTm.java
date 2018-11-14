package com.pack;

public class PayTm implements Payment{
	@Override
	public void pay(double cost, Payment payment) 
	{
		System.out.println("Payment Done by Paytm of Rupess"+cost);		
	}
}
