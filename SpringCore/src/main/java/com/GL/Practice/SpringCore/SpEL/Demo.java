package com.GL.Practice.SpringCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
		
	@Value("#{5+2}")
	private int x;
	
	@Value("#{30+87}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")  //invoking static method
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")      //invoking static variable
	private double pi;
	
	@Value("#{new java.lang.String('Anuj Saxena')}") //creating object
	private String name;
	
	@Value("#{ 8>3}")    
	private boolean isactive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isactive=" + isactive
				+ "]";
	}
	
	
	
	
}
