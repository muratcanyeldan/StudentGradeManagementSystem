package com.muratcan.studentgrademanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentDto {

    private int id;

    private String name;

    private String surName;

    private float exam1;

    private float exam2;

    private double averageGrade;

    private List<CourseDto> courseDtos = new ArrayList<>();

    private SchoolDto school;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public float getExam1() {
        return exam1;
    }

    public void setExam1(float exam1) {
        this.exam1 = exam1;
    }

    public float getExam2() {
        return exam2;
    }

    public void setExam2(float exam2) {
        this.exam2 = exam2;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<CourseDto> getCourseDtos() {
        return courseDtos;
    }

    public void setCourseDtos(List<CourseDto> courseDtos) {
        this.courseDtos = courseDtos;
    }

    public SchoolDto getSchool() {
        return school;
    }

    public void setSchool(SchoolDto school) {
        this.school = school;
    }
}
