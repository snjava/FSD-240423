package com.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository; // DI

	public void saveData() {
		System.out.println("In StudentService to save Data");
		repository.save();
	}
}
