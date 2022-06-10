package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.beans.Car;

public class TestCar {
	public static void firstTest()
	{
	  ApplicationContext ac= new ClassPathXmlApplicationContext("car.xml");	
	  Car c = ac.getBean(Car.class);
	  c.start();
	  c.move();
	}

}
