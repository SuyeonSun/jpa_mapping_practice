package com.example.demo.domain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
public class Student {
    @Id @GeneratedValue
    @Column(name = "student_id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Column(name = "school_id", insertable=false, updatable=false)
//    private Long schoolId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    @JsonIgnoreProperties("students")
    private School school;
}
