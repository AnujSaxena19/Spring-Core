package com.GL.Practice.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component    //we can give bean name also according to ourselves like @Component("ac")
@Scope("prototype")   //singleton-for creating only one object and using different times
					 //prototype-for creating different object at different times
public class Student {
	
	@Value("Anuj Saxena")
	private String studentName;
	@Value("Noida")
	private String city;
	
	@Value("#{sub}")  // for collection
	private List<String> courses;
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
