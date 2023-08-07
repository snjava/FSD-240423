package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Address;
import com.institute.repsotory.AddressRepo;

@RestController
public class AddressController {

	@Autowired
	private AddressRepo repo;
	
	@PostMapping("/save-address")
	public String saveAddress(@RequestBody Address address) {
		repo.save(address);
		return "Address Save Successfully...";
	}
	
	@GetMapping("/get-address-by-id")
	public Address getById(@RequestParam("id") int id) {
		Address add = repo.findById(id).get();
		return add;
	}
}






















