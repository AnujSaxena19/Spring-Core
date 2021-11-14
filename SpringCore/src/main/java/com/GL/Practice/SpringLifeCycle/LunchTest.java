package com.GL.Practice.SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LunchTest {
	
		public static void main(String args[]) {
			AbstractApplicationContext con=new ClassPathXmlApplicationContext("LifecycleConfig.xml");
			Lunch l=(Lunch) con.getBean("l1");
			
			System.out.println(l);
			//registering shutdownhook
			con.registerShutdownHook();
	}
}
