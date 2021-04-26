package com.muratcan.studentgrademanagementsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private int id;

    @Column
    private String name;

    @OneToMany
    @Column
    private List<Course> courses = new ArrayList<>();

    @OneToMany
    @Column
    private List<Student> students = new ArrayList<>();

    public School(int id, String name, List<Course> courses, List<Student> students) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.students = students;
    }

    public School() {
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
