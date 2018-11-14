package com.pack;

public abstract class Toppings implements Pizza
{
	String name;
	double cost;
	public Toppings(String name, double cost) {
		this.name=name;
		this.cost=cost;
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return name;
	}
	public double getCost() {
		return cost;
	}
}
