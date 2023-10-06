package com.SpringCore.Referrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Referrence/ref_Config.xml") ;
		
		A aref =(A)context.getBean("aref") ;
		System.out.println(aref.getX());
		System.out.println(aref.getOb().getY());
	}

}
