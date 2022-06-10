package com.chainsys.springproject.test;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;//child

import com.chainsys.springproject.autowire.Car;
import com.chainsys.springproject.beans.Actor;
import com.chainsys.springproject.beans.Calender;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.beans.Lunch;
import com.chainsys.springproject.beans.ScoreBoard;
import com.chainsys.springproject.lifecycle.AnnotationLc;
import com.chainsys.springproject.lifecycle.InitDesposeBean;
import com.chainsys.springproject.lifecycle.LifeCycleBean;

public class TestClasspathXml {
	public static void testA()
	{
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Sujitha");
		emp.print();
	}
	public static void testB()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		//Employee emp = ac.getBean(Employee.class);//overloaded method of getBean(class) returns object of the class(Employee),type casting is not required.
		Customer c= ac.getBean(Customer.class);
		c.setId(28);
		c.setName("Ajay");
		c.print();
		Employee emp = (Employee)ac.getBean("emp");//overloaded method of getBean(String) returns Object, so type casting is required
		emp.setId(23);
		emp.setName("Ajitha");
		emp.print();
		
	}
	public static void testlazy_init()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = ac.getBean(Employee.class);
		Customer c= ac.getBean(Customer.class);
		//lazy-init ="true" for customer. An object is created now(firstcall to getBean() method for Customer.class)
		Employee emp2 = ac.getBean(Employee.class);
		Customer c2= ac.getBean(Customer.class);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(c2.hashCode());
	}
	public static void testPrototype()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Actor hero = ac.getBean(Actor.class);
		Actor heroin = ac.getBean(Actor.class);
		Actor comedian = ac.getBean(Actor.class);
		Actor friend = ac.getBean(Actor.class);
		System.out.println(hero.hashCode());
		System.out.println(heroin.hashCode());
		System.out.println(comedian.hashCode());
		System.out.println(friend.hashCode());
	}
	public static void testBeanWithConstructor()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
	}
	public static void testFactoryMethod()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
	    ScoreBoard sb = ac.getBean("sb1",ScoreBoard.class);
	    sb.targetScore=183;
	    System.out.println(sb.targetScore);
	    ScoreBoard sb2 = ac.getBean("sb2",ScoreBoard.class);
	    System.out.println(sb2.targetScore);
	}
	public static void testCalenderFactory()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Calender today = ac.getBean(Calender.class);
		today.day=9;
		today.month="june";
		today.year=2022;
		System.out.println(today.day);
		System.out.println(today.month);
		System.out.println(today.year);
	}
	public static void testLunchFactory()
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("Lunch.xml");
		Lunch nvsiLunch =ac.getBean("nvsilunch",Lunch.class);
		Lunch vsiLunch = ac.getBean("vsilunch",Lunch.class);
		Lunch niLunch = ac.getBean("nilunch",Lunch.class);
		Lunch chLunch = ac.getBean("chlunch",Lunch.class);
		System.out.println("--------");
		nvsiLunch.serve();
		System.out.println("--------");
		vsiLunch.serve();
		System.out.println("--------");
		niLunch.serve();
		System.out.println("--------");
		chLunch.serve();
		
	}
	public static void testSetterDi() 
	{
		ApplicationContext ac1= new ClassPathXmlApplicationContext("beans.xml");	
		Employee emp=ac1.getBean("emp2",Employee.class);
		emp.print();
	}
	public static void testLifeCycle()
	{
		ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("Lc.xml");
		LifeCycleBean life=ac.getBean(LifeCycleBean.class);
		life.print();
//		LifeCycleBean life1=ac.getBean(LifeCycleBean.class);
//		LifeCycleBean life2=ac.getBean(LifeCycleBean.class);
		life=null;
		//System.gc();
		ac.close();
		ac=null;
		
	}
	public static void testInitDestroyBean()
	{
		ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("Lc.xml");
		InitDesposeBean init=ac.getBean(InitDesposeBean.class);
		init.print();
	}
	public static void testAnnotation()
	{
		ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("Lc.xml");
		AnnotationLc ann=ac.getBean(AnnotationLc.class);
		ann.print();
		ac.close();
		ac=null;		
	}
	public static void testautowire()
	{
		ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("Autowire.xml");
		Car car=ac.getBean(Car.class);
		//car.start();
		car.move();
		car=null;
		ac.close();
				
	}
	

}
