package com.chainsys.springproject.beans;

public class Engine {
	public void Start()
	{
		System.out.println("Car is Started"+ hashCode());
	}
	public Engine()
	{
		System.out.println("Engine object is created" + hashCode());
	}

}
