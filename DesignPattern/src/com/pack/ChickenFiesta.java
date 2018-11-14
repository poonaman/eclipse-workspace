package com.pack;

public class ChickenFiesta extends NonVegPizza 
{
	public ChickenFiesta(String name,double cost)
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
