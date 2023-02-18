package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	private CollegeService service;
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteSingleCollege(@PathVariable String id) {
		return service.deleteSingleCollege(id);
	}
	
	@DeleteMapping("/delete")
	public String deleteAll() {
		return service.deleteAll();
	}
	
	
	
}