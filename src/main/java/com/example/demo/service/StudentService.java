package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentResponseDto;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
//    public List<StudentResponseDto> findAll() {
//        return studentRepository.findAll().stream().map(entity -> new StudentResponseDto(entity)).collect(Collectors.toList());
//
//    }
}
