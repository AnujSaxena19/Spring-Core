package com.GL.Practice.SpringCore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {

	private Snacks samosa;
	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	public Student(Snacks samosa) {
		super();
		this.samosa = samosa;
	}
	public void study() {
		this.samosa.display();
		System.out.println("Student is studing");
	}
	public Snacks getSamosa() {
		return samosa;
	}
	public void setSamosa(Snacks samosa) {
		this.samosa = samosa;
	}
}
