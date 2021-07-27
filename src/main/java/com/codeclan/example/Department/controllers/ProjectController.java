package com.codeclan.example.Department.controllers;

import com.codeclan.example.Department.models.Project;
import com.codeclan.example.Department.repositories.EmployeeRepository;
import com.codeclan.example.Department.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProjectById(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
