package com.newproject.demo.college.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String address;
    private String city;
    private Long pinCode;

    @OneToOne(mappedBy = "address")
    private Student student;
}
