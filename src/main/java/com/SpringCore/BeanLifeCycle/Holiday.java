package com.SpringCore.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Implementing LifeCycle method using Annotation
public class Holiday {
private String place ;

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Holiday() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Holiday [place=" + place + "]";
}
@PostConstruct // this annotation supports only till java 8, or else you need to add additional dependency in pom.xml file
public void init()
{
	// method name can be anything the functionality depends on the type of annotationyou use above the method
	System.out.println("I am init() method of Holiday class");
}
@PreDestroy
public void destroy() // this annotation supports only till java 8, or else you need to add additional dependency in pom.xml file
{
	// method name can be anything the functionality depends on the type of annotationyou use above the method
System.out.println("I am destroy() method of Holiday classs");
}
// NOTE: By default these annotation wont work because by default these annotations are dissabled, to enable them, you have to edit the XML file must need to add one additional tag i.e  <context:annotation-config/> 
}
