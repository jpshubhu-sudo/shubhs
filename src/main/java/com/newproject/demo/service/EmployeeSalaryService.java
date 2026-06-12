package com.newproject.demo.service;

import com.newproject.demo.entity.EmployeeSalary;
import com.newproject.demo.repository.EmployeeSalaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeSalaryService {
    private final EmployeeSalaryRepository employeeSalaryRepository;

    public EmployeeSalary findById(Long id) {
        return employeeSalaryRepository.findById(id).orElseThrow();
    }

    public EmployeeSalary save(EmployeeSalary employeeSalary) {
        return employeeSalaryRepository.save(employeeSalary);
    }

    public List<EmployeeSalary> findAll() {
        return employeeSalaryRepository.findAll();
    }
}
