package com.example.demo.dto;

import com.example.demo.domain.School;
import com.example.demo.domain.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ResponseDto {
    private Long id;

    private String name;

    public ResponseDto(Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }
}
