 package com.GL.Practice.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class javaconfig {
	
	@Bean
	public Snacks getSnack() {
		return new Snacks();
	}
	
	@Bean
	public Student getStudent() {
		
		//creating a new student objet
		Student student=new Student(getSnack());
		return student;
	}
}
