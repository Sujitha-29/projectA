package com.chainsys.springproject.test;

import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;

import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
public class TestXmlBeanFactory {
	public static void testA()
	{
		ClassPathResource res =(new ClassPathResource("beans.xml"));
		XmlBeanFactory factory = new XmlBeanFactory (res);
		Employee emp=factory.getBean("emp3alias",Employee.class);
		emp.setName("Survesh");
		emp.setId(21);
		System.out.println(factory.isSingleton("emp"));
		System.out.println(factory.getBean("emp") instanceof Employee);
		System.out.println(factory.getBean("emp") instanceof Customer);
		System.out.println(factory.isPrototype("emp"));
		System.out.println(factory.isTypeMatch("emp",Employee.class));
	}

}
