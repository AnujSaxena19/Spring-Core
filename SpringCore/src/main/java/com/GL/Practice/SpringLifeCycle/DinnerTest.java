package com.GL.Practice.SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//implementing bean lifecycle using annotaions
public class DinnerTest {
	public static void main(String args[]) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("LifecycleConfig.xml");
		Dinner d=(Dinner) con.getBean("d1");
		
		System.out.println(d);
		//registering shutdownhook
		con.registerShutdownHook();
	}
}
