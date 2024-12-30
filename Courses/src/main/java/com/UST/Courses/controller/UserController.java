package com.UST.Courses.controller;

import com.UST.Courses.model.CourseStudent;
import com.UST.Courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/register")
	public CourseStudent adduser(@RequestBody CourseStudent user) {
		return service.adduser(user);
	}
	
	@PostMapping("/login")
	public String verify(@RequestBody CourseStudent user) {
		return service.verify(user);
	}
}