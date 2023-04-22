package com.springbootrestapi.springbootrestapi.services;

import java.util.List;

import com.springbootrestapi.springbootrestapi.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);
}
