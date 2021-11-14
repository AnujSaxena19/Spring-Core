package com.GL.Practice.SpringLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//using spring interface configuration technique
public class Lunch implements InitializingBean , DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Lunch() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lunch [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		//used as a init method while configuring using spring interface
		System.out.println("Lunch started");
		
	}

	public void destroy() throws Exception {
		
		//used as a destroy method while configuring using spring interface
		System.out.println("Lunch over");
	}
	
	
}
