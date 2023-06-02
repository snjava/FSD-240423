package com.institute.student;
import java.util.Scanner;

public class StudentInfo {
	public int id;
	protected String name;
	String address;
	private String contact;
	Scanner scan = new Scanner(System.in);
}

class StudentPerformance extends StudentInfo {
	public void printDetailsObject() {
		StudentInfo info = new StudentInfo();
		System.out.println("Id : " + info.id);
		System.out.println("Name : " + info.name);
		System.out.println("Address : " + info.address);
	}
	
	public void printDetailsInheritance() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}