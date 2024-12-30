package com.UST.Courses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseStudent {
	
	@Id
	private int id;
	private String username;
	private String password;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "PatientUser [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	public CourseStudent(int id, String username, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public CourseStudent() {
		super();
	}
	
	
}