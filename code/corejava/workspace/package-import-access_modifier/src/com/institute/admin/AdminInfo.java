package com.institute.admin;
import com.institute.student.StudentInfo;
import com.institute.teacher.TeacherInfo;



public class AdminInfo extends StudentInfo {
	public void printStudent() {
		//com.institute.student.StudentInfo info = new com.institute.student.StudentInfo();
		StudentInfo info = new StudentInfo();
		System.out.println("Id : " + info.id);
	}
	
	public void printDetailsInheritance() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}
