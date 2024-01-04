package com.data.rest.repository;

import com.data.rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "emp")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public List<Employee> findByFirstNameContaining(@Param("firstName") String firstName);
}