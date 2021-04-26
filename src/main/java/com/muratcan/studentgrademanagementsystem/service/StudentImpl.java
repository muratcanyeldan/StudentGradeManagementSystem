package com.muratcan.studentgrademanagementsystem.service;

import com.muratcan.studentgrademanagementsystem.dto.CourseDto;
import com.muratcan.studentgrademanagementsystem.dto.StudentDto;
import com.muratcan.studentgrademanagementsystem.model.Course;
import com.muratcan.studentgrademanagementsystem.model.Student;
import com.muratcan.studentgrademanagementsystem.repository.CourseRepository;
import com.muratcan.studentgrademanagementsystem.repository.SchoolRepository;
import com.muratcan.studentgrademanagementsystem.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("studentService")
public class StudentImpl implements StudentService{

    private static final Logger logger = LoggerFactory.getLogger(CourseImpl.class);

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        studentRepository.save(student);
        return convertPojoToDto(student);

    }

    @Override
    public StudentDto updateStudent(int id,StudentDto studentDto) {

        Student student=studentRepository.getOne(id);
        studentRepository.save(student);
        return studentDto;
    }

    @Override
    public List<StudentDto> listStudents() {

        List<StudentDto> studentDtos=new ArrayList<>();
        for(Student student:studentRepository.findAll()){
            studentDtos.add(convertPojoToDto(student));
        }
        return studentDtos;

    }

    private StudentDto convertPojoToDto(Student pojo){
        StudentDto studentDto=new StudentDto();
        CourseDto courseDto=new CourseDto();
        courseDto.setId(pojo.getId());
        courseDto.setName(pojo.getName());
        studentDto.setName(pojo.getName());
        studentDto.setId(pojo.getId());
        return studentDto;
    }
}
