package com.keep.calm.java.studentmanagement.service;

import com.keep.calm.java.studentmanagement.model.Student;
import java.util.List;
public interface StudentServiceIX {
    List<Student> getAllStudent();
    void createStudent(Student student);
}
