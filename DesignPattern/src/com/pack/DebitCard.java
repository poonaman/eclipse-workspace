package com.pack;

public class DebitCard implements Payment {

	@Override
	public void pay(double cost, Payment payment) 
	{
		
		System.out.println("Payment Done by DebitCard of Rupess"+cost);
	}

}
