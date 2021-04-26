package com.muratcan.studentgrademanagementsystem.repository;

import com.muratcan.studentgrademanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
