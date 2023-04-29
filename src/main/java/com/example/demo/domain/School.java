package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Builder;
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

    @JsonManagedReference
    @OneToMany(mappedBy = "school")
    private List<Student> students = new ArrayList<>();
}
