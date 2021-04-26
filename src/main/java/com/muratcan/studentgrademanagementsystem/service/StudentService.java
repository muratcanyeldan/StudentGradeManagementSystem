package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto updateStudent(int id,StudentDto studentDto);
    List<StudentDto> listStudents();
}
