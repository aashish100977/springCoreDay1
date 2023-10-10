package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Car;


public class SpringMainClass {
	
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("car.xml");
		
		
		
		Car c1=(Car) applicationContext.getBean("car1");
		System.out.println(c1);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
