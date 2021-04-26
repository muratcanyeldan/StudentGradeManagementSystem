package com.muratcan.studentgrademanagementsystem.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column
    private String name;

    @Column
    private String surName;

    @Column
    private float exam1;

    @Column
    private float exam2;

    @Column
    private double averageGrade;

    @ManyToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Course> course = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public Student(int id, String name, String surName, float exam1, float exam2, double averageGrade, List<Course> course, School school) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.averageGrade = averageGrade;
        this.course = course;
        this.school = school;
    }

    public Student() {
    }

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
        averageGrade = (exam1 + exam2) / 2;
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
