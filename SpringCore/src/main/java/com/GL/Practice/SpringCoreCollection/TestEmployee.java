package com.GL.Practice.SpringCoreCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Collectionconfig.xml");
		Employee em=(Employee)con.getBean("Emp1");
		System.out.println(em);
		System.out.println(em.getName());
		System.out.println(em.getPhones());
		System.out.println(em.getAddress());
		System.out.println(em.getCourses());
		System.out.println(em.getProps());
	}

}
