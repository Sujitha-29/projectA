package com.chainsys.springproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

public class Car {
	@Autowired
	private Engine petrolEngine;
	@Resource
	private Wheel alloy;

	public Car() {
		System.out.println("1 Car Object created " + hashCode());
	}

	public void start() {
		petrolEngine.Start();
	}

	public void move() {
		alloy.rotate();
	}

	public void begin() {
		System.out.println("Start Annotation...");
	}

	public void stop() {
		System.out.println("Stop Annotation...");
	}

	public void print() {
		System.out.println("Print Annotation is called");
	}
}