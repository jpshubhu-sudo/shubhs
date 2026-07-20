package com.newproject.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.logging.log4j.util.PropertySource;

import java.time.LocalDate;
import java.util.Comparator;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
//    @OneToOne(cascade = CascadeType.ALL)
    private Long employeeId;
    private String address;
    private LocalDate joiningDate;
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
    private int age;
    private String department;

}
