package com.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component // use to create bean in Spring containner, by default it will create object with name employee
@Component("emp") // use to initialize different name to the name 
@Scope("prototype") // by default the scope is singletone, must use with @Component annotation
public class Employee {
	@Value("101")// use to initialize the attribute value in runtime
private int id ;
	@Value("Om Sadawarti")
private String name ;
	@Value("#{adress}") // using @Value annotation to initialize collection type value, firstly create a standalone collection using util schma in xml file and use its id referrence in java file with the help of spring expression language
	private List<String> address ;
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
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}



}
