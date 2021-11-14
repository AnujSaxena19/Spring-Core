package com.GL.Practice.SpringLifeCycle;
//using xml configuration technique
public class Breakfast {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Breakfast() {
		super();
		

	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
