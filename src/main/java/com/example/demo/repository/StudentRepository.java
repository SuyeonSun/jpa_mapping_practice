package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Override
//    @EntityGraph(attributePaths = {"school"})
//    List<Student> findAll();
}
