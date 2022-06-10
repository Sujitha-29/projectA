package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.config.BeanPostProcessor;// refer AOP

public class InitDesposeBean implements DisposableBean,InitializingBean {
	private String city;
	private long pinCode;
// Called After setters
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called");
		
	}
// similar to destroy- method
	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy is called");
	}
	public InitDesposeBean()
	{
		System.out.println("InitDesposeBean object is created" + hashCode());
	}
	// After Constructor
	public void setUp()
	{
		System.out.println("starting InitDesposeBean..");
	}
	public void close()
	{
		System.out.println("closing InitDesposeBean..");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
    public static void print()
    {
    	System.out.println("Print Called in InitDesposeBean");
    }
}
