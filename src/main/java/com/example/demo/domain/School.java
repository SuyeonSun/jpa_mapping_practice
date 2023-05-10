package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class School {
    @Id @GeneratedValue
    @Column(name = "school_id")
    private Long id;

    private String name;

     @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    // school 전체 조회
    // school_id 1 조회
    // school_id 2 조회
    // school_id 3 조회
    // school_id 4 조회
     @JsonIgnoreProperties("school")
     private List<Student> students = new ArrayList<>();
}
