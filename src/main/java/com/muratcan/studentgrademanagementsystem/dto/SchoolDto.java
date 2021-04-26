package com.muratcan.studentgrademanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

public class SchoolDto {

    private int id;

    private String name;

    private List<CourseDto> courseDtos = new ArrayList<>();

    private List<StudentDto> studentDtos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDto> getCourseDtos() {
        return courseDtos;
    }

    public void setCourseDtos(List<CourseDto> courseDtos) {
        this.courseDtos = courseDtos;
    }

    public List<StudentDto> getStudentDtos() {
        return studentDtos;
    }

    public void setStudentDtos(List<StudentDto> studentDtos) {
        this.studentDtos = studentDtos;
    }
}
