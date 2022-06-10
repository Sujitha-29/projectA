package com.chainsys.springproject.autowire;

public class Engine {
	public void Start()
	{
		System.out.println("Engine is Started"+ hashCode());
	}
	public Engine()
	{
		System.out.println("Engine object is created" + hashCode());
	}

}
