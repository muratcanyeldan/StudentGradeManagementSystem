package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.dto.SchoolDto;
import com.muratcan.studentgrademanagementsystem.model.School;
import com.muratcan.studentgrademanagementsystem.model.Student;
import com.muratcan.studentgrademanagementsystem.repository.CourseRepository;
import com.muratcan.studentgrademanagementsystem.repository.SchoolRepository;
import com.muratcan.studentgrademanagementsystem.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schoolService")
public class SchoolImpl implements SchoolService{

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public SchoolDto createSchool(SchoolDto schoolDto) {

        School school=new School();
        school.setName(schoolDto.getName());

        schoolRepository.save(school);
        logger.info(school.getName()+" is created successfully");
        return schoolDto;
    }

    @Override
    public List<School> listSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public CourseDto addCourseToSchool(CourseDto courseDto) {
        Student student=studentRepository.getOne(courseDto.getId());
        School school=schoolRepository.getOne(courseDto.getId());
        return courseDto;
    }
}
