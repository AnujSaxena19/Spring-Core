package com.GL.Practice.SpringCoreReference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Objconfig.xml");
		A temp=(A) ac.getBean("a");
		System.out.println(temp.getX());
		
		System.out.println(temp.getObj().getY());
		System.out.println(temp);

	}

}
