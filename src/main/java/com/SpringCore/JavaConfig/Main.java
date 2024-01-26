package com.SpringCore.JavaConfig;

import java.awt.Container;

import javax.naming.Context;
import javax.swing.RowFilter.ComparisonType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class) ;
//		System.out.println(context.getBean("std",Student.class));
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig_Bean_Annotation.class);
		//System.out.println(context.getBean("getCollege"));// by default the bean id will be same as the method name which is used to declare the bean in java config file, if you wish to change the name then use @Bean(name={"college","clg"}) multiple names can be given by which we can call that bean// @bean uses constructor injection
		
		context.getBean("getCollege",College.class).showStudentname();
	}

}
