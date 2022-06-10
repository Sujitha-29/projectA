package com.chainsys.springproject.test;
import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext;//child

import com.chainsys.springproject.appconfig.AppConfig;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
public class TestAnnotationConfig {
	public static void testA()
	{
		ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
	    Employee emp = ac.getBean(Employee.class);
	    emp.setId(3);
	    emp.setName("sujitha");
	    emp.print();
	    Employee emp2 = ac.getBean(Employee.class);
	}
	

}
