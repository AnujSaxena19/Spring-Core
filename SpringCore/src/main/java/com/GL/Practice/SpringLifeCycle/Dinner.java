package com.GL.Practice.SpringLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dinner {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dinner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dinner [type=" + type + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Dinner started");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Dinner over");
	}
}
