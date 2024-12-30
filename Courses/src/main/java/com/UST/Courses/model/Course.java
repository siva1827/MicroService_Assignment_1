package com.UST.Courses.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    public Course() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Course(Integer id, List<Integer> studentIds, String name) {
        this.id = id;
        this.studentIds = studentIds;
        this.name = name;
    }

    @ElementCollection
    private List<Integer> studentIds = new ArrayList<>();

    public void addStudent(int studentId) {
        this.studentIds.add(studentId);
    }

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Getters and Setters
}
