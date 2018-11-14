package com.pack;

public class ChickenPizza extends NonVegPizza
{
	public ChickenPizza(String name,double cost)
	{
		super(name,cost);
	}
	public String getDescription()
	{
		return name;
	}
	public double getCost()
	{
		return cost;
	}

}
