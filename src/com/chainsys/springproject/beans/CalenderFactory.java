package com.chainsys.springproject.beans;

public class CalenderFactory {
	// the factory is not static here
	// multiple factory methods in one class
	//Calender factory is also called as initiating bean because methods in this been instantiates objects for other beans
	public Calender createCalender()
	{
		// The Calender constructor is default access modifier so,can be called here
		// The Calender class and , the calender factory class are both in the same package
		return new Calender();
	}
	public Appointments createAppointment()
	{
		return new Appointments();
	}

	
}
