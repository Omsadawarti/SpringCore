package com.SpringCore.SpringCore;

import org.SpringCore.Collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml") ;
       
       Employee std1 = (Employee) context.getBean("emp101") ;    
       System.out.println(std1.getName());
       System.out.println(std1.getAddresses());
       System.out.println(std1.getCourses());
       System.out.println(std1.getPhones());
    }
}
