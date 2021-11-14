package com.GL.Practice.SpringCore.SpEL;

import java.beans.Expression;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpELconfig.xml");
		Demo d=ac.getBean("demo",Demo.class);
		System.out.println(d);
		
		//using SpEL parser
		SpelExpressionParser temp= new SpelExpressionParser();
		org.springframework.expression.Expression expression=temp.parseExpression("23+54");
		System.out.println(expression.getValue());
		
	}
}
