package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext(ReplaceDot.replaceIt("com.SpringCore.Stereotype.")+"stereotypec_config.xml");
//Employee emp = context.getBean("employee",Employee.class) ;
//Employee emp = context.getBean("emp",Employee.class) ;
//System.out.println(emp.hashCode());
//Employee eno = context.getBean("emp",Employee.class) ;
//System.out.println(eno.hashCode());

Teacher teacher = context.getBean("teacher",Teacher.class) ;
Teacher teach = context.getBean("teacher",Teacher.class) ;

System.out.println(teacher.hashCode());
System.out.println(teach.hashCode());
	}

}
