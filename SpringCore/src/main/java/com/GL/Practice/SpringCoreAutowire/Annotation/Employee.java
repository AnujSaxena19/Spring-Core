package com.GL.Practice.SpringCoreAutowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//@Autowired     // annotation using property
	
	private Address1 address;

	public Address1 getAddress() {
		return address;
	}
	
	@Autowired     //annotation using setter
	@Qualifier("address2")
	public void setAddress(Address1 address) {
		System.out.println("Setting");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired  //annotation using constructor
	
	public Employee(Address1 address) {
		System.out.println("Constructor setted");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
}
