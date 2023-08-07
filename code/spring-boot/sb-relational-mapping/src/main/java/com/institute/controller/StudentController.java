package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		//Student stud = repo.getById(id);
		Student stud = repo.findById(id).get();
		return stud;
	}
	
}


























