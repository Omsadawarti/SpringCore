package com.SpringCore.Standalone.Collection;

import java.util.List;

public class Student {
	private String name ;
	private List<Long> phones ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getPhones() {
		return phones;
	}
	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phones=" + phones + "]";
	}
	
	
}
