package com.newproject.demo.college.repository;

import com.newproject.demo.college.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

interface AddressRepository extends JpaRepository<Address, Long> {
}
