package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.dto.ResponseDto;
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
    // public List<Student> findAll() {
    //    return studentRepository.findAll();
    // }
    public List<ResponseDto> findAll() {
        return studentRepository.findAll().stream().map(entity -> new ResponseDto(entity)).collect(Collectors.toList());

    }
}
