package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.model.Course;
import com.muratcan.studentgrademanagementsystem.repository.CourseRepository;
import com.muratcan.studentgrademanagementsystem.repository.SchoolRepository;
import com.muratcan.studentgrademanagementsystem.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseImpl implements CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public  Course createCourse(CourseDto courseDto) {

        Course course=new Course();
        course.setName(courseDto.getName());
        courseRepository.save(course);
        logger.info(course.getName()+" is created successfully");
        return course;
    }

    @Override
    public List<Course> listCourses(){
        return courseRepository.findAll();
    }
}
