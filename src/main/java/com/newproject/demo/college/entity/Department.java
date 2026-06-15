package com.newproject.demo.college.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Student> students;
}
