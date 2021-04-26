package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.model.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(CourseDto courseDto);
    List<Course> listCourses();
}
