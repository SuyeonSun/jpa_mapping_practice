package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("")
    // public List<Student> findAll() {
    //    return studentService.findAll();
    // }
    public List<ResponseDto> findAll() {
        return studentService.findAll();
    }
}
