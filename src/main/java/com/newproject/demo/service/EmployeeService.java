package com.newproject.demo.service;

import com.newproject.demo.entity.Employee;
import com.newproject.demo.entity.EmployeeDto;
import com.newproject.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeDto saveEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return modelMapper.map(employee1, EmployeeDto.class);
    }

    public List<EmployeeDto> findEmployee() {
        List<Employee> employee = employeeRepository.findAll();
        List<Integer> list1 = employee.stream().map(emp -> emp.getAge()).toList();
        List<Integer> list2 = list1.stream().distinct().sorted().toList();
        System.out.println(list1);
        System.out.println(list2);
        List<Employee> list = employee.stream().filter(e -> e.getAge() > 30).toList();
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for (Employee employee1 : list) {
            EmployeeDto dto = modelMapper.map(employee1, EmployeeDto.class);
            employeeDtos.add(dto);
        }
        return employeeDtos;
    }

    public EmployeeDto updateEmployee(Employee employee, Long id) {
        Employee employee1 = employeeRepository.findById(id).orElse(null);
        if (employee1 != null) {
            modelMapper.map(employee, employee1);
            employeeRepository.save(employee1);
        }
        return modelMapper.map(employee1, EmployeeDto.class);
    }
}
