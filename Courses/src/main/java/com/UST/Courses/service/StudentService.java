package com.UST.Courses.service;

import com.UST.Courses.model.CourseStudent;
import com.UST.Courses.model.Student;
import com.UST.Courses.repository.StuRepo;
import com.UST.Courses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private JWTService jwtservice;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private StuRepo repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public CourseStudent adduser(CourseStudent user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return user;
	}

	public String verify(CourseStudent user) {
		
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
	
		if(authentication.isAuthenticated()) {
			return jwtservice.generateToken(user.getUsername());
		}
		return "fail";
	}
	
	
}