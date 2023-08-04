package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Student;
import com.institute.repsotory.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Save Successfully...";
	}
	
}
