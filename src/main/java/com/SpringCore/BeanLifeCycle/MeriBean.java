package com.SpringCore.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Implementing LifeCycle method using Interface
public class MeriBean implements InitializingBean,DisposableBean {
private int id ;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public MeriBean() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "MeriBean [id=" + id + "]";
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	// works as destroy()
	System.out.println("I am Under destroy()");
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	// works as init()
	System.out.println("I am Under init()");

}


}
