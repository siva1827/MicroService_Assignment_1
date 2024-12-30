package com.UST.Courses.service;

import com.UST.Courses.exception.StudentNotFoundException;
import com.UST.Courses.model.CourseStudent;
import com.UST.Courses.model.Student;
import com.UST.Courses.model.UserPrincipal;
import com.UST.Courses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import com.project.PatientManagement.model.PatientUser;
//import com.project.PatientManagement.model.UserPrincipal;
//import com.project.PatientManagement.repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	public StudentRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws StudentNotFoundException {
		CourseStudent user = repo.findByName(username);
		
		if(user == null) {
			throw new StudentNotFoundException("Not found username");
		}
		return new UserPrincipal(user);
	}
}