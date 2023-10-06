package org.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringCore.ReplaceDot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			Employee emp = context.getBean("emp",Employee.class) ;
			System.out.println(emp.getAray());
	}

}
