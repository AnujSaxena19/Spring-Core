package com.GL.Practice.SpringCoreConstructor;

public class Person {
	
	private String name;
	private int personId;
	private Certi cert;
	public Person(String name, int personId, Certi cert) {
		
		this.name = name;
		this.personId = personId;
		this.cert=cert;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.personId +"{" +this.cert.name+"}";
	}
	
	
}
