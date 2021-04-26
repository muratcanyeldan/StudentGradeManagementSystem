package com.muratcan.studentgrademanagementsystem.controller;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.dto.SchoolDto;
import com.muratcan.studentgrademanagementsystem.repository.SchoolRepository;
import com.muratcan.studentgrademanagementsystem.service.CourseImpl;
import com.muratcan.studentgrademanagementsystem.service.SchoolService;
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
@RequestMapping("/school")
public class SchoolController {

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private SchoolRepository schoolRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createSchool(@RequestBody SchoolDto schoolDto) {
        logger.info("Creating School");
        return ResponseEntity.ok(schoolService.createSchool(schoolDto));
    }

    @GetMapping("/listAllSchools")
    public ResponseEntity<?> listAllSchools() {
        return ResponseEntity.ok(schoolService.listSchools());
    }

    @PostMapping("/addCourseToSchool")
    public ResponseEntity<?> addCourseToSchool(@RequestBody CourseDto courseDto) {
        return ResponseEntity.ok(schoolService.addCourseToSchool(courseDto));
    }
}
