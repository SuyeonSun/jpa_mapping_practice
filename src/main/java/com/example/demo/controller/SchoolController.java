package com.example.demo.controller;

import com.example.demo.domain.School;
import com.example.demo.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping("")
    public List<School> findAll() {
        return schoolService.findAll();
    }
}
