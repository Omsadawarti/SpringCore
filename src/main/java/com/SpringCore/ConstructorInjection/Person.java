package com.SpringCore.ConstructorInjection;

public class Person {
private String name ;
private int age ;
private Emp emp ;
public Person(String name, int age , Emp emp) {
	super();
	this.name = name;
	this.age = age;
	this.emp = emp ;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", emp=" + emp + "]";
}



}
