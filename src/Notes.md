 1.First JVM gets loaded    
 1.Main method gets executed   
 1.Application context is loaded    
 1. context reads xml configuration file  
 1.ApplicationContext pre loads one object for each bean in the configuration file   
         if bean is not marked as "lazy-init=true"  
 1.lazy-init="true" This informs Spring Container not to pre load object for this bean  
 1. By default spring early loads objects in memory.  
 1. for lazy-init beans object is created only when the grtBean() method is called  
 1.For pre-init beans grtBean()   returns reference of the pre load object  
 1.By default only one object for every object is created (singleton)  
 1.singleton: atleast one object for every class but not more than one object  
 1.spring for lazy-init bean creates a singleton object on firstcall of grtBeans() method   
 and the uses that object for future getBean() method calls.
 
 ---  
  
 ##Prototype
1. Prototype beans are by default lay-init  
1. Prototype are not singleton
1. A new  object  is created for Prototype when getBean  () method is called

 ```java
     <bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>
 ```
---
## Bean With parameterized constructor 

```java
   <constructor-arg type = "java.lang.String" value ="Beast"  />
      <constructor-arg type = "java.lang.String" value ="Nelson"  />
```
---
## Factory Method
   
 
 
 
 
 
 
 
 
 