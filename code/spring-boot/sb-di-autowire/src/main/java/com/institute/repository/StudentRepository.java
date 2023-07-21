package com.institute.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.institute.util.DBProperties;

@Repository
public class StudentRepository {

	@Autowired
	DBProperties dbProperties;
	
	public void save() {
		System.out.println("In StudentRepository to save Data");
		System.out.println("URL : " + dbProperties.getUrl());
		System.out.println("UserName : " + dbProperties.getUsername());
		System.out.println("Password : " + dbProperties.getPassword());
	}
}
