package com.practice.projects.my_project.course;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	private CourseService courseService;
	private CourseRepository courseRepository;

	public CourseController(CourseService courseService,CourseRepository courseRepository) {
		super();
		this.courseService = courseService;
		this.courseRepository = courseRepository;
	}
	
	@GetMapping("/course/{username}/courses")
	public List<Course> retrieveCourses(@PathVariable String username) {
		//return courseService.findByUsername(username);
		return courseRepository.findByUsername(username);
	}
	
	@GetMapping("/course/{username}/{id}")
	public Course retrieveCoursebyId(@PathVariable String username, @PathVariable Integer id) {
		//return courseService.findByUsername(username);
		return courseRepository.findById(id).get();
	}
	
	@DeleteMapping("/course/{username}/{id}")
	public void DeleteTodo(@PathVariable String username, @PathVariable Integer id) {
		courseRepository.deleteById(id);		
	}
	
	@PutMapping("/course/{username}/{id}")
	public Course updateCourse(@PathVariable String username, @PathVariable Integer id, @RequestBody Course course) {
		courseRepository.save(course);
		return course ;		
	}
	@PostMapping("/course/{username}/courses")
	public Course createCourses(@PathVariable String username, @RequestBody Course course) {
		course.setUserName(username);
		return courseRepository.save(course);
	}	
}
