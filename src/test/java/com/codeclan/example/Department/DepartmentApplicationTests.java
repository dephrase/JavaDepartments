package com.codeclan.example.Department;

import com.codeclan.example.Department.models.Department;
import com.codeclan.example.Department.models.Employee;
import com.codeclan.example.Department.models.Project;
import com.codeclan.example.Department.repositories.DepartmentRepository;
import com.codeclan.example.Department.repositories.EmployeeRepository;
import com.codeclan.example.Department.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class DepartmentApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Department department = new Department("Shoe La La");
		departmentRepository.save(department);
		Employee employee = new Employee("David", "Fraser", 103, department);
		employeeRepository.save(employee);
	}

	@Test
	public List<Employee> canGetAllEmployees(){
		return employeeRepository.findAll();
	}

	@Test
	public void canSaveDepartment(){
		Department department = new Department("Mens Fancy Shoes");
		departmentRepository.save(department);
	}

	@Test
	public List<Department> canGetAllDepartments(){
		return departmentRepository.findAll();
	}

	@Test
	public void canAddEmployeeToDepartment(){
		Department department = new Department("Chocolate");
		departmentRepository.save(department);
		Employee employee = new Employee("John", "Adams", 209, department);
		employeeRepository.save(employee);
		department.addEmployeeToDepartment(employee);
		departmentRepository.save(department);
	}

	@Test
	public void canAddProjectToEmployee(){
		Project project = new Project("Project", 100);
		projectRepository.save(project);
		Department department = new Department("Stevie");
		departmentRepository.save(department);
		Employee employee = new Employee("Jeb", "Fruit", 300, department);
		employeeRepository.save(employee);
		project.addEmployeeToProject(employee);
		projectRepository.save(project);
	}

	@Test
	public void canAddEmployeeToProject(){
		Project project = new Project("Hello", 100);
		projectRepository.save(project);
		Department department = new Department("Jebediah");
		departmentRepository.save(department);
		Employee employee = new Employee("Holy", "Moly", 150, department);
		employeeRepository.save(employee);
		employee.addProjectToEmployee(project);
		employeeRepository.save(employee);
	}

}
