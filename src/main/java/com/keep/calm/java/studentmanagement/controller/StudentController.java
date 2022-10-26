package com.keep.calm.java.studentmanagement.controller;

import com.keep.calm.java.studentmanagement.model.Student;
import com.keep.calm.java.studentmanagement.service.StudentServiceIX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceIX studentServiceIX;



    @PostMapping(value = "/student",consumes = MediaType.APPLICATION_JSON_VALUE)
            public void createStudent(@RequestBody Student student){
        studentServiceIX.createStudent(student);

    }
    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents(){
        return studentServiceIX.getAllStudent();
    }
}