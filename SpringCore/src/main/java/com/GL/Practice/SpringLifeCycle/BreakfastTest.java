package com.GL.Practice.SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BreakfastTest {
	
	public static void main(String args[]) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("LifecycleConfig.xml");
		Breakfast f=(Breakfast) con.getBean("f1");
		
		System.out.println(f);
		//registering shutdownhook
		con.registerShutdownHook();
	}
}
