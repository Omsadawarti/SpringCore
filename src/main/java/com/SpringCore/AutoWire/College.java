package com.SpringCore.AutoWire;

public class College {
private String name ;
private int id ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public College(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public College() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "College [name=" + name + ", id=" + id + "]";
}


}
