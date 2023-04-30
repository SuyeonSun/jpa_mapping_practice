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

    private List<Student> students;

    public ResponseDto(School school) {
        this.id = school.getId();
        this.name = school.getName();
        this.students = school.getStudents();
    }
}
