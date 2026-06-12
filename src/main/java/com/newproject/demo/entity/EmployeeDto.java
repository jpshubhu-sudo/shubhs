package com.newproject.demo.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {
    private Long id;
    private String name;
    private String lastName;
    private Long employeeId;
    private String address;
    private LocalDate joiningDate;
    private LocalDate dateOfBirth;
    private int age;
    private String department;
}
