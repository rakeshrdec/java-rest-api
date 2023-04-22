package com.springbootrestapi.springbootrestapi.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springbootrestapi.springbootrestapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list ;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1,"java course","this is java course for backend"));
		list.add(new Course(12,"node course","this is node course for fullstack"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		
		for (Course course: list) {
			if(course.getId() == courseId) {
				 c =course;
				 break;
			}
		}
		// TODO Auto-generated method stub
		return c;
	}

}
