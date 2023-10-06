package com.SpringCore.ConstructorInjection;

import java.util.List;
import java.util.Set;

public class Emp {
private int id ;
private String name ;
private Set<Long> phones ;
private List<String> addresses ;

public Emp(int id, String name , Set<Long> phones, List<String> addresses)
{
	this.id = id ;
	this.name = name ;
	this.addresses = addresses ;
	this.phones = phones ;
	
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", phones=" + phones + ", addresses=" + addresses + "]";
}







}
