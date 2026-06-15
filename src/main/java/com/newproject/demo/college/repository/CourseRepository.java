package com.newproject.demo.college.repository;

import com.newproject.demo.college.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

interface CourseRepository extends JpaRepository<Course, Long> {
}
