package com.SpringCore.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context =    new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.AutoWire.")+"autoWireConfig.xml") ;

//Employee emp = context.getBean("emp",Employee.class) ;
//System.out.println(emp);

Student std = context.getBean("std",Student.class);
System.out.println(std);
	}

}
