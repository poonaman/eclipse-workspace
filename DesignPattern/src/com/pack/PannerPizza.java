package com.pack;

public class PannerPizza extends VegPizza
{
	public PannerPizza(String name,double cost)
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
