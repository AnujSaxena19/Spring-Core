package com.GL.Practice.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("StereoAnnotationconfig.xml");
		
		Student s=con.getBean("student",Student.class);
		System.out.println(s);
		
		System.out.println(s.getCourses());
		System.out.println(s.getCourses().getClass().getName());
		System.out.println(s.hashCode());
		
		Student s2=con.getBean("student",Student.class);
		System.out.println(s2.hashCode());
		
		Teacher t1=con.getBean("teacher",Teacher.class);
		Teacher t2=con.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}
}
