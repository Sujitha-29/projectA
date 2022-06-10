package com.chainsys.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//  not working from java9 and higher versions
public class AnnotationLc {
	public AnnotationLc()
	{
		System.out.println("Annotation object is created " + hashCode());
	}
	@PostConstruct
   public void start()
   {
	   System.out.println("Start Annotation...");
   }
	@PreDestroy
   public void stop()
   {
	   System.out.println("Stop Annotation...");
   }
	public void print()
	{
		System.out.println("Print Annotation is called");
	}
}
