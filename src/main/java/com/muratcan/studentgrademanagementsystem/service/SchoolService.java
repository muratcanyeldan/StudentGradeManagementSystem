package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.dto.SchoolDto;
import com.muratcan.studentgrademanagementsystem.model.School;

import java.util.List;

public interface SchoolService {

    SchoolDto createSchool(SchoolDto schoolDto);
    List<School> listSchools();
    CourseDto addCourseToSchool(CourseDto courseDto);
}
