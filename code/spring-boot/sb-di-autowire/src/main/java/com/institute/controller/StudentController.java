package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.institute.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService; // DI 

	public void saveStudentData() {
		System.out.println("In StudentController to save Data");
		studentService.saveData();
	}
}
