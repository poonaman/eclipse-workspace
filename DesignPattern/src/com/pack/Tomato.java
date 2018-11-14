package com.pack;

public class Tomato extends Toppings
{

	Pizza pizza;
	public Tomato(Pizza pizza, String name, double cost) 
	{
		super(name,cost);
		this.pizza = pizza;
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
