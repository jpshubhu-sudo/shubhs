package com.newproject.demo.controller;

import com.newproject.demo.service.EmployeeService;
import com.newproject.demo.entity.Employee;
import com.newproject.demo.entity.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/details")
    public List<EmployeeDto> findEmployee() {
    return employeeService.findEmployee();
    }

    @PostMapping("/save-employee")
    public EmployeeDto saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public EmployeeDto updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        return employeeService.updateEmployee(employee, id);
    }
}
