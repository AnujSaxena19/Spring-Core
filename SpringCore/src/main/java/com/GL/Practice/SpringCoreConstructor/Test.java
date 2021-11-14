package com.GL.Practice.SpringCoreConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String args[]) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("ConstructorConfig.xml");
			Person p=(Person) ac.getBean("person");
			System.out.println(p);
			
			Addition add=(Addition) ac.getBean("add");
			add.doSum();
		}
}
