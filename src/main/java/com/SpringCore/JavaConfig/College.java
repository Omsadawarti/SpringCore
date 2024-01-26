package com.SpringCore.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

// Now we wont use @Component annotation to creat4e a bean , instead we will use @Bean annotation in javaconfiguration file to create a bean of this class, and if we create a bean inside a javaconfiguration file itself i.e by using @Bean anootation, then there is no need to use component scan
public class College {
	@Value("101")
private int id ;
	@Value("#{new String('YCCE')}")
private String name ;
	@Autowired
	@Qualifier("std")
	private Student student ; ;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	public void showStudentname()
	{
		System.out.println(student.getStudentName()); ;
	}
	
	
}
