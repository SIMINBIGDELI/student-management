package com.keep.calm.java.studentmanagement.repository;

import com.keep.calm.java.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryIX extends JpaRepository<Student,Long> {
}
