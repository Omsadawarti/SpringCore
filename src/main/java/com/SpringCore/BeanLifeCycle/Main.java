package com.SpringCore.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.BeanLifeCycle.")+"life_cycle_config.xml") ;
//		MyBean m1 = (MyBean) context.getBean("m1") ;
//		System.out.println(m1);
		context.registerShutdownHook(); // this method will call the destroy() method, and it is comming from 
		// AbstractApplicationContext, thats why now we have to use AbstractApplicationContext instead of ApplicationContext
		
		
//	MeriBean m2 = (MeriBean) context.getBean("m2") ;
//	System.out.println(m2);
		
		Holiday hl = (Holiday) context.getBean("h1") ;
		
	}

}
