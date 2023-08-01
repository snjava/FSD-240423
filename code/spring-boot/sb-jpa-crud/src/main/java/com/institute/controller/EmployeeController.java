package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Employee;
import com.institute.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save-employee")
	public String saveEmp(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		return "Employee Save Successfully...";
	}
	
	@GetMapping("/get-employees")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@PutMapping("/update-employee")
	public String updateEmployee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
		return "Data Updated Successfully..";
	}
	
	@DeleteMapping("/delete-employee")
	public String deleteEmp(@RequestParam("id") int id) {
		service.deleteEmployee(id);
		return "Employee deleted successfully with Id : "+ id;
	}
}














