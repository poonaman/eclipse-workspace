package com.pack;

public class CustomerDetails 
{
	int id;
	String name;
	public CustomerDetails() 
	{
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
