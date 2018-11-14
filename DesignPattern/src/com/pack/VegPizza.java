package com.pack;

public class VegPizza  implements Pizza
{
	String name;
	double cost;
	public VegPizza(String name,double cost)
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
