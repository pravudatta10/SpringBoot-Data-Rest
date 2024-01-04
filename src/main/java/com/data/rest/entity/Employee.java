package com.data.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
}