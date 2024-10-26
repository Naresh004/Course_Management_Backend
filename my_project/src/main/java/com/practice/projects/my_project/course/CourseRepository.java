package com.practice.projects.my_project.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	List<Course> findByUsername(String username);
	
	

}
