package com.newproject.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeSalary {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private Long salary;
}

