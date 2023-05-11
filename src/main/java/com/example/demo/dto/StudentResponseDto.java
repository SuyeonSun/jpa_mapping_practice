package com.example.demo.dto;

import com.example.demo.domain.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudentResponseDto {
    private Long id;

    private String name;

    public StudentResponseDto (Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }
}
