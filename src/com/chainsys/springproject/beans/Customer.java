package com.chainsys.springproject.beans;

public class Customer {
	public Customer()
	{
		System.out.println("Customer object created " + hashCode());
	}
	private String name;
	private int id;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
    public void print()
    {
    	System.out.println(this.getId());
    	System.out.println(this.getName());
    }

}
