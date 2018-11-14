package com.pack;

public class Olives extends Toppings
{
	Pizza pizza;
	
	public Olives(Pizza pizza, String name, double cost) 
	{
		super(name,cost);
		this.pizza = pizza;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String getDescription() 
	{
	return name;
		
	}

	@Override
	public double getCost()
	{
		return cost+pizza.getCost();
		
	}

}
