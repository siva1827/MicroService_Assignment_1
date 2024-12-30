package com.UST.Courses.repository;

import com.UST.Courses.model.CourseStudent;
import com.UST.Courses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    CourseStudent findByName(String username);
}
