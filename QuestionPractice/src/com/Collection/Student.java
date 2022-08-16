package com.Collection;

public class Student {

	private String name;
	private int rollNo;
	private String college;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student(String name, int rollNo, String college, String department) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.college = college;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", college=" + college + ", department=" + department
				+ "]";
	}
	
	
}
