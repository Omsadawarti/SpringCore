package com.SpringCore.Standalone.Collection;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.Standalone.Collection.")+"standalone_config.xml");

Student std = context.getBean("student",Student.class) ;
System.out.println(std);
	}

}
