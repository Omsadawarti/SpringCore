package com.SpringCore.JavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std") // using @Component annotation to create bean
public class Student {
private int id ;
@Value("Om Sadawarti")
private String name ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public String getStudentName()
{
	return name ;
}

}
