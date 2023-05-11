package com.example.demo.service;

import com.example.demo.domain.School;
import com.example.demo.dto.SchoolResponseDto;
import com.example.demo.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    @Transactional(readOnly = true)
     public List<School> findAll() {
        return schoolRepository.findAll();
     }
//    public List<SchoolResponseDto> findAll() {
//        return schoolRepository.findAll().stream().map(entity -> new SchoolResponseDto(entity)).collect(Collectors.toList());
//    }
}
