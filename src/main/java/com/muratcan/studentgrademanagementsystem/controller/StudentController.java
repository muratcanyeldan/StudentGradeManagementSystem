package com.muratcan.studentgrademanagementsystem.controller;

import com.muratcan.studentgrademanagementsystem.dto.StudentDto;
import com.muratcan.studentgrademanagementsystem.repository.StudentRepository;
import com.muratcan.studentgrademanagementsystem.service.CourseImpl;
import com.muratcan.studentgrademanagementsystem.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody StudentDto studentDto) {
        logger.info("Creating student");
        return ResponseEntity.ok(studentService.createStudent(studentDto));

    }

    @GetMapping("/listAll")
    public ResponseEntity<?> listAllStudents() {
        return ResponseEntity.ok(studentService.listStudents());
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable(value = "id") int id, @RequestBody StudentDto studentDto) {
        return ResponseEntity.ok(studentService.updateStudent(id,studentDto));

    }
}
