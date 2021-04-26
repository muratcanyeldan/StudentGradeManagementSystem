package com.muratcan.studentgrademanagementsystem.repository;

import com.muratcan.studentgrademanagementsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
