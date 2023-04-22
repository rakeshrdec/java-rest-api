package com.springbootrestapi.springbootrestapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.springbootrestapi.entities.Course;
import com.springbootrestapi.springbootrestapi.services.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to boot application of courses";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();	
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));	
		
	}
}
