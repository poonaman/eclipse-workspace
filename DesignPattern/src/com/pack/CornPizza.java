package com.pack;

public class CornPizza extends VegPizza
{
	public CornPizza(String name,double cost)
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
