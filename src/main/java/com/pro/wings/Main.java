package com.pro.wings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld obj = (HelloWorld)ctx.getBean("helloworld");
		
		Student std = (Student)ctx.getBean("std");
		
		Employee emp = (Employee)ctx.getBean("emp");
		
		System.out.println(obj);
		System.out.println(std);
		System.out.println(emp);

	}

}
