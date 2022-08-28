package com.example.demo.model;

public class Student {

	private Integer studentid;
	private String studentname;
	private String studentmailid;
	private Integer studentage;
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentmailid() {
		return studentmailid;
	}
	public void setStudentmailid(String studentmailid) {
		this.studentmailid = studentmailid;
	}
	public Integer getStudentage() {
		return studentage;
	}
	public void setStudentage(Integer studentage) {
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmailid=" + studentmailid
				+ ", studentage=" + studentage + "]";
	}
	
	
}
