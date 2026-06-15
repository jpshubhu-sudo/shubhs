package com.newproject.demo.college.repository;

import com.newproject.demo.college.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

interface DepartmentRepository extends JpaRepository<Department, Long> {
}
