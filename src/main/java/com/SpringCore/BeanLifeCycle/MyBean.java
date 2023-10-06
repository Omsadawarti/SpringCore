package com.SpringCore.BeanLifeCycle;
//Implementing LifeCycle method using XML file
public class MyBean {
private int id ;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("Initializing the value");
	this.id = id;
}

public MyBean() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "MyBean [id=" + id + "]";
}

public void init()
{
	System.out.println("I am Inside Init");
}

public void destroy()
{
	System.out.println("I am Inside Destroy");
}
}
