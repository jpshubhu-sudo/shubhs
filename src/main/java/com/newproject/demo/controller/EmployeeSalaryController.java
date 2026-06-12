package com.newproject.demo.controller;

import com.newproject.demo.entity.EmployeeSalary;
import com.newproject.demo.exception.GlobalExceptionHandler;
import com.newproject.demo.service.EmployeeSalaryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary")
@AllArgsConstructor
public class EmployeeSalaryController {
    private final EmployeeSalaryService employeeSalaryService;

    @GetMapping("/{id}")
    public EmployeeSalary employeeSalary(@PathVariable Long id) throws GlobalExceptionHandler {
        return employeeSalaryService.findById(id);
    }
    @GetMapping("")
    public List<EmployeeSalary> employeeSalaryAll() {
        return employeeSalaryService.findAll();
    }

    @PostMapping("/save")
    public EmployeeSalary save(@RequestBody EmployeeSalary employeeSalary) {
        return employeeSalaryService.save(employeeSalary);
    }
}
