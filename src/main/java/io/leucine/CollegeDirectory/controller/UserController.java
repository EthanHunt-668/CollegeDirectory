package io.leucine.CollegeDirectory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.leucine.CollegeDirectory.binding.DashboardObject;
import io.leucine.CollegeDirectory.entity.*;
import io.leucine.CollegeDirectory.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public DashboardObject loginCheck(@RequestBody User u) {
		DashboardObject obj= service.login(u);
		return obj;
	}
	
//	@PostMapping("/studentSearch")
//	public SearchObject search(@RequestBody Student stu) {
//		SearchObject obj= service.searchStudent(stu);
//		return obj;
//	}
//	
//	@GetMapping("/contact")
//	public FacultyObject faculty(Integer i) {
//		FacultyObject obj= service.getFacultyDetails(i);
//		return obj;
//	}
	
}
