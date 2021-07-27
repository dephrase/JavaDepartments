package com.codeclan.example.Department.repositories;

import com.codeclan.example.Department.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
