package com.example.demo.model;

public class Student {

	String sid;
	String sname;
	String marks;
	
	public Student() {
		super();
	}
	
	public Student(String sid, String sname, String marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
}
