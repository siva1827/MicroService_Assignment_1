package com.UST.Courses.repository;

import com.UST.Courses.model.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepo extends JpaRepository<CourseStudent,Integer> {
}
