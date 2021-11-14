package com.GL.Practice.SpringCoreAutowire.XML;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	

	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		System.out.println("Constructor setted");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
}
