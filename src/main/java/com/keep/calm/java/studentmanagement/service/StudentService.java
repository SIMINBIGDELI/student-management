package com.keep.calm.java.studentmanagement.service;

import com.keep.calm.java.studentmanagement.model.Student;
import com.keep.calm.java.studentmanagement.repository.StudentRepositoryIX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements StudentServiceIX {
    @Autowired
    private StudentRepositoryIX studentRepositoryIX;


    @Override
    public List<Student> getAllStudent() {
        return studentRepositoryIX.findAll();
    }

    @Override
    public void createStudent(Student student) {
        studentRepositoryIX.save(student);

    }
}

