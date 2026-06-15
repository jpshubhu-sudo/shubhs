package com.newproject.demo.college.repository;

import com.newproject.demo.college.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

interface StudentRepository extends JpaRepository<Student, Long> {
}
