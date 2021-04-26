package com.muratcan.studentgrademanagementsystem.controller;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.model.Course;
import com.muratcan.studentgrademanagementsystem.repository.CourseRepository;
import com.muratcan.studentgrademanagementsystem.service.CourseImpl;
import com.muratcan.studentgrademanagementsystem.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createCourse(@RequestBody CourseDto courseDto) {
        logger.info("Creating course");
        Course course=new Course();
        course.setName(courseDto.getName());
        return ResponseEntity.ok(courseService.createCourse(courseDto));
    }

    @GetMapping("/listAllCourses")
    public ResponseEntity<?> listAllCourses() {
        return ResponseEntity.ok(courseRepository.findAll());

    }
}
