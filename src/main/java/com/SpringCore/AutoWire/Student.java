package com.SpringCore.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
private String name ;
@Autowired // By defualt all the annotation including @Autowired is disabled , to enable them all in order to use their functionality we have to edit .xml file i.e <context:annotation-config/>
@Qualifier("clg")
private College college ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public College getCollege() {
	return college;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
//@Autowired
public void setCollege(College college) {
	System.out.println("Setting College Object");
	this.college = college;
}
public Student(String name, College college) {
	super();
	this.name = name;
	this.college = college;
}

public Student(College college)
{
	System.out.println("Constructor mai hu bhai");
	this.college = college ;
}
@Override
public String toString() {
	return "Student [name=" + name + ", college=" + college + "]";
}


}
