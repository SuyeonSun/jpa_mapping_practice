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
    @JsonIgnoreProperties("school")
    private List<Student> students = new ArrayList<>();
}
