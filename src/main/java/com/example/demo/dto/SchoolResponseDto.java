package com.example.demo.dto;

import com.example.demo.domain.School;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SchoolResponseDto {
    private Long id;

    private String name;

    public SchoolResponseDto (School school) {
        this.id = school.getId();
        this.name = school.getName();
    }
}
