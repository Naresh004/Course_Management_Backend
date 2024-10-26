package com.practice.projects.my_project.course;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	private static List<Course> course = new ArrayList<>();
	private static int courseCount = 0;
	
	static {
		
		course.add(new Course(courseCount++, 100,"Naresh", "SpringBoot", "Ranga","springboot with microservices", 4));
		course.add(new Course(courseCount++, 101,"Naresh", "Java", "navin","A-Z Core Java", 5));
		course.add(new Course(courseCount++, 102,"Naresh","AWS", "Sai","Amazon web services", 4));
		course.add(new Course(courseCount++, 103,"sai","Kubernetes", "Ram","Maintaining resorces", 5));
		course.add(new Course(courseCount++, 104,"Naresh","Docker", "Krishna","Deployment resorces", 4));
	}
	
	public List<Course> findByUsername(String username){
		Predicate<? super Course> predicate = 
				crs-> crs.getUserName().equalsIgnoreCase(username);
		return course.stream().filter(predicate).toList();
	}
	

}