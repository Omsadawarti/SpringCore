package com.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.ConstructorInjection.")+"ci_config.xml") ;
//			Person p1 =(Person)context.getBean("per101") ;
//			System.out.println(p1);
		
		Addition add = (Addition)context.getBean("add") ;
		add.doSum();
		
	}

	

}
