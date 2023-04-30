package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
