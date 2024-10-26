package com.practice.projects.my_project.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	public Course() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	@Column(name = "course_code")
	int courseCode;
	String username;
	@Column(name = "course_name")
	String courseName;
	String instructor;
	String description;
	int courseRating;
	
	
	public Course(int courseId, int courseCode,String username, String courseName, String instructor, String description,
			int courseRating) {
		super();
		this.courseId = courseId;
		this.courseCode = courseCode;
		this.username = username;
		this.courseName = courseName;
		this.instructor = instructor;
		this.description = description;
		this.courseRating = courseRating;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCourseRating() {
		return courseRating;
	}
	public void setCourseRating(int courseRating) {
		this.courseRating = courseRating;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseCode=" + courseCode + ", username=" + username
				+ ", courseName=" + courseName + ", instructor=" + instructor + ", description=" + description
				+ ", courseRating=" + courseRating + "]";
	}

}
