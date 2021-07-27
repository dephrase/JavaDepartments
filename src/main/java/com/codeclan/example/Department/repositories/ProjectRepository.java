package com.codeclan.example.Department.repositories;

import com.codeclan.example.Department.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
