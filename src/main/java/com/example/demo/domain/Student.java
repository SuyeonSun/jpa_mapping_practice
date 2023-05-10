package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    // student 전체 조회
    // school_id 1 조회
    // school_id 2 조회
    // school_id 3 조회
    @JoinColumn(name = "school_id")
    @JsonIgnoreProperties("students")
    private School school;
}
