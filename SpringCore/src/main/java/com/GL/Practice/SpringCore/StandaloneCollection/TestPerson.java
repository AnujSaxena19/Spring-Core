package com.GL.Practice.SpringCore.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("StandaloneCollectionconfig.xml");
	
	Person p1=ac.getBean("person1",Person.class);
	System.out.println(p1.getFriends().getClass().getName());
	System.out.println(p1);
	System.out.println(p1.getFeestructure().getClass().getName());
	System.out.println(p1.getFeestructure());
	
	System.out.println(p1.getProps());
	System.out.println(p1.getProps().getClass().getName());

	}

}
