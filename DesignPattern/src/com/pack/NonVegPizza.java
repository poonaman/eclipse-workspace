package com.pack;

public class NonVegPizza implements Pizza
{

	String name;
   double  cost;
	public NonVegPizza(String name,double cost)
	{
		this.name=name;
		this.cost=cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
}
