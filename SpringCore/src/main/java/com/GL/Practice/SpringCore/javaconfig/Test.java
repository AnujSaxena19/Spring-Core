package com.GL.Practice.SpringCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

		public static void main(String[] args) {
			ApplicationContext ac=new AnnotationConfigApplicationContext(javaconfig.class);
			Student s1=ac.getBean("getStudent",Student.class);
			System.out.println(s1);
			s1.study();
		}
}
