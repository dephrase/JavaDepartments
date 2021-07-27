package com.codeclan.example.Department.repositories;

import com.codeclan.example.Department.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
