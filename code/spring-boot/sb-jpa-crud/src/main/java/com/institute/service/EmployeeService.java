package com.institute.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.entity.Employee;
import com.institute.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public void saveEmployee(Employee emp) {
		repo.save(emp); // insert or update
	}
	
	public List<Employee> getAllEmployee() {
		return repo.findAll(); // select all records
	}
	
	public void updateEmployee(Employee emp) {
		repo.save(emp); // insert or update
	}
	
	public void deleteEmployee(int id) {
		repo.deleteById(id); // Delete by PK
	}
}
