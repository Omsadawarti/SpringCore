package com.SpringCore.SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {
public static String address = "Nagpur" ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.SpringExpressionLanguage.")+"spel_config.xml");
		
		College clg = context.getBean("college",College.class);
		System.out.println(clg);
	}

}
