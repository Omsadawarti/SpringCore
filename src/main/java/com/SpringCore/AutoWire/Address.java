package com.SpringCore.AutoWire;
// autowire using xml file
public class Address {
private String city ;
private String State ;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Address(String city, String state) {
	super();
	this.city = city;
	State = state;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", State=" + State + "]";
}


}
