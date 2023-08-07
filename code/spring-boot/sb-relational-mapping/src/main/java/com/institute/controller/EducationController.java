package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Education;
import com.institute.repsotory.EducationRepository;

@RestController
public class EducationController {

	@Autowired
	private EducationRepository educationRepository;
	
	@PostMapping("/save-education")
	public String saveEducation(@RequestBody Education edu) {
		educationRepository.save(edu);
		return "Data Save Successfully..";
	}
	
}
