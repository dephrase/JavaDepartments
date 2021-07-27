package com.codeclan.example.Department.controllers;

import com.codeclan.example.Department.models.Department;
import com.codeclan.example.Department.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

}
