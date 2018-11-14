package com.pack;

public class CreditCard implements Payment
{

	@Override
	public void pay(double cost, Payment payment) 
	{
		System.out.println("Payment Done by CreditCard of Rupees "+cost);		
	}

}
