package com.SpringCore.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class College {

	@Value("#{1+19}")
	private int id ;
	@Value("YCCE")
	private String name ;
	
	@Value("#{T(java.lang.Math).sqrt(144)}") 
	private double squareRoot ;
	@Value("#{T(com.SpringCore.SpringExpressionLanguage.Main).address}")
	private String address ;
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
	public double getSquareRoot() {
		return squareRoot;
	}
	public void setSquareRoot(double squareRoot) {
		this.squareRoot = squareRoot;
	}
	
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", squareRoot=" + squareRoot + ", address=" + address + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
