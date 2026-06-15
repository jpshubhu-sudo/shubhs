package com.newproject.demo.college.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int courseId;
    private String courseName;
    private String courseCode;

    @ManyToMany(mappedBy = "courses")
    private List<Student> studentId;
}
