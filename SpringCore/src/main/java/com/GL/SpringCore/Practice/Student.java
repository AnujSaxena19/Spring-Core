package com.GL.SpringCore.Practice;

public class Student {
	
	private int studentId;
	private String studName;
	private String studAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}
	
	
}
